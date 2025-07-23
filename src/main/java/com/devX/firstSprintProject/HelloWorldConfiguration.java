package com.devX.firstSprintProject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Record is released in JDK 16
record Person (String name, int age, Address address) {};
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
		return new Person("Ravi",21, new Address("Mihan", "Nagpur"));
	}
	
	@Bean
	public Person person2MethodCall() {
		// Calling Beans method directly
		return new Person(name(), age(), address()); // name, age, address
	}
	
	@Bean
	public Person person3Parameters(String name, int age, Address getAddress) { // name, age, getAddress
		// Passing as parameters
		return new Person(name, age, getAddress); // name, age
	}


	@Bean(name = "getAddress")
	public Address address() {
		return new Address("Baker Street", "London");
	}

}
