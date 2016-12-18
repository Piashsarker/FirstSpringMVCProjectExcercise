package com.ptlearnpoint.hellocontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admission")
public class StudentAdmissionController {
	@InitBinder 
	public void initBinder(WebDataBinder binder ){
		binder.setDisallowedFields(new String[]{"studentDOB"});
	}
	
	@RequestMapping(value = "/admissionForm.html", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() {
		ModelAndView model = new ModelAndView("AdmissionForm");
		return model;

	}

	@ModelAttribute
	public void addingCommonObjects(Model model1) {

		model1.addAttribute("headerMsg", "PTLEARNPOINT.COM");

	}

	@RequestMapping(value = "/submitAdmissionForm.html", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@ModelAttribute("student1") Student student1, BindingResult result) {

		if (result.hasErrors()) {
			ModelAndView model = new ModelAndView("AdmissionForm");
			model.addObject("error_msg", "Please Enter All Value Correctly");
			return model;

		}
		ModelAndView model1 = new ModelAndView("AdmissionSuccess");
		return model1;

	}
	
	//Init Binder is Used to make a method with WebDataBinder argument to customize html fields input .. 
	

}
