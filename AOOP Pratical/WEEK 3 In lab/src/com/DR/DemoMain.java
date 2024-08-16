package com.DR;

public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Game game = Game.getInstance();
	        GameLevelManager levelManager = GameLevelManager.getInstance();

	        GameElementFactory easyLevelFactory = new EasyLevelFactory();
	        levelManager.setLevelFactory(easyLevelFactory);
	        levelManager.configureGame(game);
	        game.play();

	        System.out.println("------------");

	        GameElementFactory hardLevelFactory = new HardLevelFactory();
	        levelManager.setLevelFactory(hardLevelFactory);
	        levelManager.configureGame(game);
	        game.play();
	}

}


