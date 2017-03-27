package com.curso.spring.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

@Controller
@RequestMapping("/api")
public class SaludadorController {

	@RequestMapping(path="/alta", method=RequestMethod.POST)
	public String alta(Model model, HttpServletRequest request, HttpSession session){
		
		model.addAttribute("mensaje", "Hola Mundo!!!!!");
		
		return null;
	}
	
	@RequestMapping(path="/alta", method=RequestMethod.GET)
	public String altaInit(){
		return null;
	}
	
	@RequestMapping("/baja")
	public View baja(){
		return null;
	}
	
	@RequestMapping("/modificar")
	public ModelAndView modificar(){
		
		ModelAndView modelAndView = new ModelAndView("");
		
		modelAndView.addObject("mensaje", "Hola Mundo!!!!!");
		
		return modelAndView;
	}
	
}
