package com.curso.spring.mvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.curso.spring.mvc.controller")
@EnableWebMvc
public class ConfiguracionWebMvc {

	@Bean
	public String saludo(){
		return new String("Hola Mundo!!!!");
	}
	
	@Bean
	public String despedida(){
		return new String("Adios Mundo!!!!");
	}	
}
