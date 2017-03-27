package com.curso.spring.mvc.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.curso.spring.mvc.entidades.Persona;

@RestController
@RequestMapping(path="/Persona", consumes="application/json", produces="application/json")
public class PersonaRestController {

	@RequestMapping(path="/{name}", method=RequestMethod.GET)
	public Persona consultar(@PathVariable("name") String nombre){
		return null;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Persona> consultar(){
		return null;
	}
	
	//Persona?age=12
	@RequestMapping(method=RequestMethod.GET)
	public List<Persona> consultar(@RequestParam("age") int edad){
		return null;
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public void insertar(Persona persona){
		
	}
	
	@RequestMapping(method=RequestMethod.PUT)
	public void modificar(Persona persona){
		
	}
	
	@RequestMapping(method=RequestMethod.DELETE)
	public void borrar(String nombre){
		
	}
	
}
