package com.curso.spring.mvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@ComponentScan("com.curso.spring.mvc.controller")
//Define entre otros el Bean de Spring RequestMappingHandlerMapping
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
	
	@Bean
	public ViewResolver viewResolver(){
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver("/WEB-INF/views/", ".jsp");
		viewResolver.setViewClass(JstlView.class);
		return viewResolver;
	}
}
