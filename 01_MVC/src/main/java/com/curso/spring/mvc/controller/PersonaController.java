package com.curso.spring.mvc.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.JstlView;

import com.curso.spring.mvc.entidades.Persona;

@Controller
@RequestMapping("/Persona")
public class PersonaController {
	
	@RequestMapping(
			path="/alta", 
			method=RequestMethod.GET)
	public String altaInit(Model model){
		
		Persona persona = new Persona();
		
		//incluir en el modelo un objeto con collecion de los posibles valores de sexo
		
		model.addAttribute("persona", persona);
		
		return "alta"; //clave de la Vistas
	}
	
	@RequestMapping(
			path="/alta", 
			method=RequestMethod.POST)
	public View alta(@Valid @ModelAttribute Persona persona, Errors errors, Model model){
		
		//invocacion al servicio
		
		if(!errors.hasErrors()){
			model.addAttribute("mensaje", "Se ha dado de alta la persona con nombre: " + persona.getNombre());
		}
		
		return new JstlView("/WEB-INF/views/alta.jsp");
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
