package com.example.springmvc.Controller;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
//can be used in class level
//@RequestMapping("/first")
public class MainController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/home")
	public String display() {
		return "home";
	}
	/*
	 * send data from Controller to View
	 * Model-addAttribute("key","value")
	 * ModelAndView-addObject("key",value)
	 * */

	/*
	 * Send data from view to controller
	 * HttpServletRequest
	 * int i=Integer.parseInt(req.getParameter("t1"))
	 *
	 * @RequestParam("t1") int i->get parameter one by one
	 * @Model Attribute - get all data in one object
	 * */
	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("t1") int i,
							@RequestParam("t2") int j
//							HttpServletRequest req,
//							HttpServletResponse res
	)
	{
//		int i=Integer.parseInt(req.getParameter("t1"));
//		int j=Integer.parseInt(req.getParameter("t2"));
		int k=i+j;
		//pass data to web
		ModelAndView mv=new ModelAndView();
		//which view u want to call
		mv.setViewName("result");
		mv.addObject("result",k);

	return mv;
	}



}
