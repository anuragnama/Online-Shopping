package net.anu.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	//for all type of mapping we have one handler
	
	@RequestMapping(value= {"/","/home","/index"})
	public ModelAndView index() {
		ModelAndView mv= new ModelAndView("page");
		mv.addObject("title", "Home");
		mv.addObject("userClickHome",true);
		return mv;
	}

	/*@RequestMapping(value="/test")
	public ModelAndView test(@RequestParam(value="greeting", required=false)String greeting){
		ModelAndView mv= new ModelAndView("page");
		mv.addObject("greeting",greeting);
		return mv;
		
	}*/
	
/*	@RequestMapping(value="/test/{greeting}")
	public ModelAndView test2(@PathVariable("greeting")String greeting){
		if(greeting==null) {
			greeting="Hello I'm Here";
		}
		ModelAndView mv= new ModelAndView("page");
		mv.addObject("greeting",greeting);
		return mv;
		
	}*/

}
