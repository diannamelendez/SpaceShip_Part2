package com.mycompany.a2;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;

public class ShipCrashesIntoAsteroidCommand extends Command {
	
	//fields
	private GameWorld gw;
	
	//constructors
	public ShipCrashesIntoAsteroidCommand(GameWorld gw) {
		super("Ship Crashes Into Asteroid" );
		this.gw = gw;	
	}
	
	//methods
	//only one method to override action perfomred
	
	@Override
	public void actionPerformed(ActionEvent e) {
		gw.crashedAstroid();
		//System.out.println("Add Asteroid");
		
	}
	
	

}