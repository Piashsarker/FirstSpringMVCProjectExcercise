package com.ptlearnpoint.hellocontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class Index {
 
	@RequestMapping("/index.html")
	public ModelAndView getIndex(){
		ModelAndView view = new ModelAndView("Index");
		return view; 
	}
}
