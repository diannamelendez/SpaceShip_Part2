package com.mycompany.a2;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;

public class AsteroidCollideCommand extends Command {
	
	//fields
	GameWorld gw;
	
	//constructors
	public AsteroidCollideCommand(GameWorld gw) {
		super("Asteroid Collide" );
		this.gw = gw;	
	}
	
	//methods
	//only one method to override action perfomred
	
	@Override
	public void actionPerformed(ActionEvent e) {
		gw.exterminatedAstroid();
		//System.out.println("Add Asteroid");
		
	}
	
	

}