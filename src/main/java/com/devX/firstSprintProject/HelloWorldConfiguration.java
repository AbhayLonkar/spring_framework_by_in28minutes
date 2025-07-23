package com.devX.firstSprintProject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Record is released in JDK 16
record Person (String name, int age) {};
record Address (String firstline, String city) {};


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
	
	@Bean 
	public Person person() {
		return new Person("Ravi",21);
	}

	@Bean(name = "getAddress")
	public Address address() {
		return new Address("Mihan", "Nagpur");
	}

}
