package com.curso.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//No es necesario, ya que @SpringBootApplication añade el escaneo del paquete "com.curso.spring" 
//@ComponentScan("com.curso.spring.mvc.controller")
//No es necesario añadirlo porque la anotacion @SpringBootApplication lo añade por el hecho de tner en el classpath el starter web
//@EnableWebMvc
public class ConfiguracionWebMvc {

	//Si se necesitarian definir Beans de Negocio
	@Bean
	public String saludo(Saludador saludador){
		
		return new String("Hola Mundo!!!!");
	}
	
	@Bean
	public String despedida(){
		return new String("Adios Mundo!!!!");
	}
	
	//No es necesario porque el starter de thymeleaf añade un ViewResolver para las plantillas de thymeleaf
	/*@Bean
	public ViewResolver viewResolver(){
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver("/WEB-INF/views/", ".jsp");
		viewResolver.setViewClass(JstlView.class);
		return viewResolver;
	}*/
}
