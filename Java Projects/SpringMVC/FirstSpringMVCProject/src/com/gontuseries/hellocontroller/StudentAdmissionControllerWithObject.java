package com.gontuseries.hellocontroller;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionControllerWithObject {
	
	@InitBinder
	public void initBinder(WebDataBinder binder){
		//binder.setDisallowedFields(new String[] {"studentMobile"});
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy****MM****dd");
		binder.registerCustomEditor(Date.class, "studentDOB", new CustomDateEditor(dateFormat, false));
		binder.registerCustomEditor(String.class, "studentName", new StudentNameEditor());
	}
	
	@RequestMapping(value="/admissionForm1", method=RequestMethod.GET)
	protected ModelAndView getAdmissionForm(){
		System.out.print("hi");
		ModelAndView model=new ModelAndView("AdmissionForm1");
		//model.addObject("headerMessage", "Gontu College of Engineering");
		return model;
	}
	
	@ModelAttribute
	public void addingCommonObjects(Model model1){
		model1.addAttribute("headerMessage", "Gontu College of Engineering & Technology");
	}
	
	@RequestMapping(value="/submitAdmissionForm1", method=RequestMethod.POST)
	protected ModelAndView submitAdmissionForm(@Valid @ModelAttribute("student1") Student student1, BindingResult result){
		
		
		if(result.hasErrors()){
			ModelAndView model1=new ModelAndView("AdmissionForm1");
			return model1;
		}
		/*Student s1=new Student();
		s1.setStudentName(name);
		s1.setStudentHobby(hobby);*/
		
		ModelAndView model=new ModelAndView("AdmissionSuccess1");
		//model.addObject("headerMessage", "Gontu College of Engineering");
		//model.addObject("student1", s1);
		return model;
		
	}

}
