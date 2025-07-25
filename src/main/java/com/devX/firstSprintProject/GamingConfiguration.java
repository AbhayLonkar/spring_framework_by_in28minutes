package com.devX.firstSprintProject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.devX.firstSprintProject.game.GameRunner;
import com.devX.firstSprintProject.game.GamingConsole;
import com.devX.firstSprintProject.game.PacManGame;


@Configuration
public class GamingConfiguration {
	
	@Bean
	public GamingConsole game() {
		var game = new PacManGame();
		return game; 
	}
	
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}
	
}
