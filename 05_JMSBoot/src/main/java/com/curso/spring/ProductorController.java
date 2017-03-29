package com.curso.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductorController {

	@Autowired
	JmsTemplate jmstemplate;
	
	@RequestMapping("/generar")
	public String generarMensaje(){
		
		jmstemplate.convertAndSend("mailbox", "Este es el mensaje que queremos enviar");
		
		return "se genero el mensaje";
	}
	
}
