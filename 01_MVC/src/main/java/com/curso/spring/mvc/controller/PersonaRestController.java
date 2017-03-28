package com.curso.spring.mvc.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.curso.spring.mvc.entidades.Persona;

@RestController
@RequestMapping(path="/Persona")
public class PersonaRestController {

	@RequestMapping(path="/{name}", method=RequestMethod.GET, produces="application/json")
	//@ResponseBody //No hacefalta ponerlo porque es implicito con @Restcontroller
	public ResponseEntity<Persona> consultar(@PathVariable("name") String nombre){
		
		//Invoacion de una determinada logica de negocio
		Persona resultadoNegocio = new Persona(nombre, 22);
		
		//Preparacion de la respuesta
		HttpHeaders headers = new HttpHeaders();
		
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		HttpStatus status = HttpStatus.OK;
		
		ResponseEntity<Persona> respuesta = new ResponseEntity<Persona>(resultadoNegocio, headers, status);
		return respuesta;
	}
	
	@RequestMapping(method=RequestMethod.GET, produces="application/json")
	public ResponseEntity<List<Persona>> consultarPaginado(
			@RequestParam(name="age", required=false) int edad, 
			@RequestParam(required=false) Integer from, 
			@RequestParam(required=false) Integer size, 
			@RequestParam(required=false) Integer count){
		return null;
	}
	
	@RequestMapping(path="/{name}/padre", method=RequestMethod.GET, produces="application/json")
	public ResponseEntity<Persona> consultarPadre(@PathVariable("name") String nombre){
		return null;
	}
	
	@RequestMapping(method=RequestMethod.POST, consumes="application/json")
	public ResponseEntity<Void> insertar(@RequestBody Persona persona) throws URISyntaxException{
		HttpHeaders headers = new HttpHeaders();
		
		headers.setLocation(new URI("/Persona/" + persona.getNombre()));
		
		HttpStatus status = HttpStatus.CREATED;
		
		return new ResponseEntity<>(headers, status);
	}
	
	@RequestMapping(method=RequestMethod.PUT, consumes="application/json")
	public ResponseEntity<Void> modificar(@RequestBody Persona persona) throws URISyntaxException{
		HttpHeaders headers = new HttpHeaders();
		
		headers.setLocation(new URI("/Persona/" + persona.getNombre()));
		
		HttpStatus status = HttpStatus.CREATED;
		
		return new ResponseEntity<>(headers, status);
	}
	
	@RequestMapping(path="/{name}", method=RequestMethod.DELETE)
	public ResponseEntity<Void> borrar(@PathVariable("name") String nombre){
		MultiValueMap<String, String> headers = null;
		HttpStatus status = null;
		
		return new ResponseEntity<>(headers, status);
	}
	
}
