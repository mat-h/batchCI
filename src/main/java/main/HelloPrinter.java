package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import service.IHello;

@Component
public class HelloPrinter {

	final IHello service;
	
	@Autowired
	public HelloPrinter(IHello service) {
		this.service = service;
	}
	
	public void print() {
		System.out.println(service.getMessage());
	}
}
