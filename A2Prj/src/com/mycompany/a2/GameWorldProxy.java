package com.mycompany.a2;

import java.util.Observable;

public class GameWorldProxy extends Observable implements IGameWorld{

	private GameWorld gameWorld;
	
	public GameWorldProxy(GameWorld gameWorld) {
		this.gameWorld = gameWorld;
	}


	
	@Override
	public int getPlayerScore() {
		// TODO Auto-generated method stub
		return gameWorld.getPlayerScore();
	}
	
	
	//code here to accept and hold a gameWorld, provide implementations
	//of all the public methods in a gameWorld, forward allowed
	//calls to the actual gameWorld and reject calls to methods
	//which the outside should not be able to access in the gameWorld

	@Override
	public void addObserver(IObserver o) {
		// TODO Auto-generated method stub
		
	}

	/*@Override
	public void tellObservers() {
		// TODO Auto-generated method stub
		
	}*/

	@Override
	public int getClockTime() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getLives() {
		// TODO Auto-generated method stub
		return 0;
	}

}
