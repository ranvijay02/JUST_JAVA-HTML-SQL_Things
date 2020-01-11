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

import com.deloitte.bean.User;
import com.deloitte.exception.UserException;
import com.deloitte.service.IUserService;

@Controller
public class UserController {
	@Autowired
	IUserService userService;

	List<String> catList = null;
	List<User> alist;

	@RequestMapping(value = "/addUser.obj")
	public String redirectToAddUser(Model model) throws UserException {
		User user = new User();
		model.addAttribute("clist", catList);
		model.addAttribute("user", user);
		return "userForm";
	}

	@RequestMapping(value = "/submitUser.obj")
	public String addUser(
			@ModelAttribute(value = "user") @Valid User user,
			BindingResult bindingResult, Model model) throws UserException {
		if (bindingResult.hasErrors()) {
			model.addAttribute("clist", catList);
			return "userForm";
		} else {
			int output = userService.addUser(user);
			model.addAttribute("userId", user.getId());
			if (output == 1) {
				return "successAdd";
			} else {
				return "userAdded";
			}
		}
	}

	@RequestMapping(value = "/retreiveUser.obj")
	public String showAllUsers(Model model) throws UserException {
		alist = userService.getUserList();
		model.addAttribute("elist", alist);
		System.out.println(alist);
		return "showAllPage";
	}

	@RequestMapping(value = "/goHome.obj")
	public String goToHome(Model model) {
		return "index";
	}
	
	@ExceptionHandler(UserException.class)
	public String handleException(UserException e){
		e.printStackTrace();
		return "userException";
	}
	@ExceptionHandler(Exception.class)
	public String handleException(Exception e){
		e.printStackTrace();
		return "dataException";
	}

}
