package com.gontuseries.hellocontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController {
	
	@RequestMapping(value="/admissionForm", method=RequestMethod.GET)
	protected ModelAndView getAdmissionForm(){
		System.out.print("hi");
		ModelAndView model=new ModelAndView("AdmissionForm");
		return model;
	}
	
	@RequestMapping(value="/submitAdmissionForm", method=RequestMethod.POST)
	protected ModelAndView submitAdmissionForm(@RequestParam(value="studentName", defaultValue="Mr. XYZ") String name, @RequestParam("studentHobby") String hobby){
		
		ModelAndView model=new ModelAndView("AdmissionSuccess");
		model.addObject("msg", "Details Submitted by You : Name = "+name+", Hobby = "+hobby);
		return model;
		
	}

}
