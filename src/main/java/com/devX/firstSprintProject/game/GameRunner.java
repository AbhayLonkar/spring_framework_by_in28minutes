package com.devX.firstSprintProject.game;

public class GameRunner {
	private GamingConsole game;
	public GameRunner(GamingConsole game) {
		this.game = game;
	}
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running game: " + game);
		game.down();
		game.up();
		game.right();
		game.left();
	}
}