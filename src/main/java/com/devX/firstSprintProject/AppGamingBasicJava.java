package com.devX.firstSprintProject;

import com.devX.firstSprintProject.game.GameRunner;
import com.devX.firstSprintProject.game.MarioGame;
import com.devX.firstSprintProject.game.SuperContraGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var marioGame = new MarioGame();
//		var superContraGame = new SuperContraGame();
		var gameRunner = new GameRunner(marioGame);
		gameRunner.run();

	}

}
