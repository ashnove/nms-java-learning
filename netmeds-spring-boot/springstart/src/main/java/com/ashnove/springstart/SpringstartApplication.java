package com.ashnove.springstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringstartApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =  SpringApplication.run(SpringstartApplication.class, args);
		
		Alien a = context.getBean(Alien.class); 
		a.show(); 
//		Alien a1 = context.getBean(Alien.class);
//		a1.show(); 
	}

}
