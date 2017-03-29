package com.curso.spring;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumidor {
	@JmsListener(destination = "mailbox")
	public void receiveMessage(String email) {
		System.out.println("Received <" + email + ">");
	}
}
