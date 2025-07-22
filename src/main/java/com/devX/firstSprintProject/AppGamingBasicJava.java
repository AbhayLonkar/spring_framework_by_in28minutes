package com.devX.firstSprintProject;

import com.devX.firstSprintProject.game.GameRunner;
import com.devX.firstSprintProject.game.MarioGame;
import com.devX.firstSprintProject.game.PacManGame;
import com.devX.firstSprintProject.game.SuperContraGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		var game = new MarioGame();
//		var game = new SuperContraGame();
		var game = new PacManGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
	}
}
