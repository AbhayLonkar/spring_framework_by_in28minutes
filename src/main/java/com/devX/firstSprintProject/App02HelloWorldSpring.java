package com.devX.firstSprintProject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var context = 
				new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		System.out.println(context);
 
	}
}
