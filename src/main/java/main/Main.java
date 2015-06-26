package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import data.dto.AccessLogDto;

@Configuration
@ComponentScan
public class Main {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/spring/applicationContext.xml");

		RepositorySearcher s = ctx.getBean(RepositorySearcher.class);
		AccessLogDto r = s.get("");
		System.out.println(r);
	}

}
