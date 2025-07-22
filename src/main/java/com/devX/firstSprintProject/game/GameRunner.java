package com.devX.firstSprintProject.game;

public class GameRunner {
	private MarioGame game;
	public GameRunner(MarioGame game) {
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