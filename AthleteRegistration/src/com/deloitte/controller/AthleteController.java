package com.deloitte.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.deloitte.bean.Athlete;
import com.deloitte.exception.AthleteException;
import com.deloitte.service.IAthleteService;

@Controller
public class AthleteController {
	@Autowired
	IAthleteService athleteService;

	List<String> catList = null;
	List<Athlete> alist;

	@RequestMapping(value = "/addAthlete.obj")
	public String redirectToAddAthlete(Model model) throws AthleteException {
		Athlete athlete = new Athlete();
		catList = athleteService.getCategory();
		model.addAttribute("clist", catList);
		model.addAttribute("athlete", athlete);
		return "athleteForm";
	}

	@RequestMapping(value = "/submitAthlete.obj")
	public String addAthlete(
			@ModelAttribute(value = "athlete") @Valid Athlete athlete,
			BindingResult bindingResult, Model model) throws AthleteException {
		//System.out.println(athlete);
		if (bindingResult.hasErrors()) {
			catList = athleteService.getCategory();
			model.addAttribute("clist", catList);
			return "athleteForm";
		} else {
			int output = athleteService.addAthlete(athlete);
			model.addAttribute("athleteId", athlete.getId());
			if (output == 1) {
				return "successAdd";
			} else {
				return "athleteAdded";
			}
		}
	}

	@RequestMapping(value = "/retreiveAthletes.obj")
	public String showAllAthletes(Model model) throws AthleteException {
		alist = athleteService.getAthleteList();
		model.addAttribute("elist", alist);
		//System.out.println(alist);
		return "showAllPage";
	}

	@RequestMapping(value = "/goHome.obj")
	public String goToHome(Model model) {
		return "index";
	}
	
	@ExceptionHandler(AthleteException.class)
	public String handleException(AthleteException e){
		e.printStackTrace();
		return "athleteException";
	}
	@ExceptionHandler(Exception.class)
	public String handleException(Exception e){
		e.printStackTrace();
		return "dataException";
	}

}
