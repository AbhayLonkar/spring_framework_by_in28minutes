package com.devX.firstSprintProject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		
	}
}
