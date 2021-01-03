package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("Home")
	public ModelAndView home(Alien alien) {
		 ModelAndView mv = new ModelAndView();
		  mv.addObject("obj", alien);
		  mv.setViewName("Home");
		  return mv;
		  
		 
		
		//String name= req.getParameter("name");
		//System.out.println("hi"+ name);
		//req.setAttribute("name", name);
		//HttpSession session = req.getSession();
		//session.setAttribute("name",name);
		//return "Home";
		
	}
}
