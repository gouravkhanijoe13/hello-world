package com.gontuseries.hellocontroller;

import java.util.Map;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
 
@Controller
//@RequestMapping("/greet")
public class HelloController{
 
	//@RequestMapping("/welcome")
	@RequestMapping("/welcome/{countryName}/{UserName}")
	protected ModelAndView helloPage(@PathVariable Map<String,String> pathVars) {

		ModelAndView modelAndView=new ModelAndView("HelloPage");
		modelAndView.addObject("welcomeMessage", "Hi "+pathVars.get("UserName")+", Welcome to first spring mvc application. You Belong to "+pathVars.get("countryName"));
		
		return modelAndView;
	}
}
