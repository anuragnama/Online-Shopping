package net.anu.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	//for all type of mapping we have one handler
	@RequestMapping(value= {"/","/home","/index"})
	
	public ModelAndView index() {
		ModelAndView mv= new ModelAndView("page");
		mv.addObject("greeting", "Welcome in Spring MVC");
		return mv;
	}

}
