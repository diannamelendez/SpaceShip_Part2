package com.mycompany.a2;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;

public class AsteroidWhacksSaucerCommand extends Command {
	
	//fields
	GameWorld gw;
	
	//constructors
	public AsteroidWhacksSaucerCommand(GameWorld gw) {
		super("Asteroid Whacks Saucer" );
		this.gw = gw;	
	}
	
	//methods
	//only one method to override action perfomred
	
	@Override
	public void actionPerformed(ActionEvent e) {
		gw.impactedNPS();
		//System.out.println("Add Asteroid");
		
	}
	
	

}