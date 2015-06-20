package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.IHello;

@Configuration
@ComponentScan
public class Main {
	
	@Bean
	IHello getHello() {
		return new IHello() {
			public String getMessage() {
				return "Hello, world!";
			}			
		};
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello, world!");
		
		// ApplicationContext ctx = new AnnotationConfigApplicationContext(Main.class);
		ApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/spring/applicationContext.xml");
		System.out.println("Configured.");
		HelloPrinter p = ctx.getBean(HelloPrinter.class);
		p.print();
		DBPrinter d = ctx.getBean(DBPrinter.class);
		d.print();
	}

}
