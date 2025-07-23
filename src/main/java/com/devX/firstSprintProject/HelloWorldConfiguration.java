package com.devX.firstSprintProject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	 public String name() {
		 return "Abhay";
	 }
	
	@Bean
	public int age() {
		return 21;
	}


}
