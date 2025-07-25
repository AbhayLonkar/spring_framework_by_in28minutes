package com.devX.firstSprintProject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.devX.firstSprintProject.game.GameRunner;
import com.devX.firstSprintProject.game.GamingConsole;

public class App03GamingSpringJava {

	public static void main(String[] args) {
		try(var context = 
				new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
						
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}
	}

}
