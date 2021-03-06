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

		Searcher<AccessLogDto> s = ctx.getBean(Searcher.class);
		AccessLogDto r = s.search("");
		System.out.println(r);
	}

}
