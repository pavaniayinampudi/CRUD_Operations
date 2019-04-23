package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import model.Team;

@Controller
public class LinkController {

	
	 @RequestMapping(value="/")
	    public ModelAndView mainPage() {
		 System.out.println("main");
		// modelAndView.addObject("team", new Team());
	        return new ModelAndView("home");
	    }
	 
	    @RequestMapping(value="/index")
	    public ModelAndView indexPage() {
	    	System.out.println("return inder");
	        return new ModelAndView("home");
	    
	 
	}
	    
}
