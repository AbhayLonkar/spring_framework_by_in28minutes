package com.devX.firstSprintProject;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		
		// 1: Launch a Sprint Context
		var context = 
				new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		// 2: Configure the things that we want Spring to manage - 
		// HelloWorldConfiguration - @Configuration
		// name - @Bean
		
		// 3: Retrieving Beans managed By Spring
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("person2MethodCall"));
		System.out.println(context.getBean("person3Parameters"));
		System.out.println(context.getBean("getAddress")); // Retrieving bean which has a custom name, set under @Beans annotation
		System.out.println(context.getBean(Address.class)); // Retrieving Address class from HelloWorldConfiguration
		
		//Functional Programming
		//Getting names of all the beans 
		Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
		
		// This will result in an Exception as there are more than one bean of type Person
		// To resolve this any one bean of Person type should be set as primary using @Primary Annotation
		System.out.println(context.getBean(Person.class));
		
	}
}
