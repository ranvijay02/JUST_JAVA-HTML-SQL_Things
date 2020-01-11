package com.deloitte;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service/greeting")
public class MyRestController {
	@RequestMapping (value = "/{name}" , method=RequestMethod.GET)
	public String getGreeting( @PathVariable String name) {
    String result = " Hi "+name+", Greetings from REST Comntroller";
		return "";
	}

}
