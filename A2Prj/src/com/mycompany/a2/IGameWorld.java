package com.mycompany.a2;

public interface IGameWorld {
	
	//Specifications here all GameWorld methods

	int getPlayerScore(); //returns player score

	void addObserver(IObserver o);

	//void tellObservers();

	
	//int getMissileCount();

	int getClockTime();

	int getLives();

	void notifyObservers();
	
	
	
	//get other game attributes
	
}
