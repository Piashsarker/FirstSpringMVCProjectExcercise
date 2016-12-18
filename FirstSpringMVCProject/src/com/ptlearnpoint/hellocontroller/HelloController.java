package com.ptlearnpoint.hellocontroller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/hello")
public class HelloController {

	@RequestMapping("/welcome")
	public ModelAndView helloWorld(){
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("msg", "hello-worldd");
		return model; 
	}
	

	@RequestMapping("/hi/countryName/userName")
	public ModelAndView exampleMethod(){
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("msg", "Hello Using Country Name and Username");
		return model; 
	}
	@RequestMapping("/check/countryName/{userName}")
	public ModelAndView exampleMethod1(){
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("msg", "Hello Using Country Name and Username");
		return model; 
	}
	@RequestMapping("/check1/{countryName}/{userName}")
	public ModelAndView exampleMethod2(@PathVariable("userName")String name,@PathVariable("countryName")String country){
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("msg", "Hello Using Country Name "+country+" and Username:"+name);
		return model; 
	}

	

}
