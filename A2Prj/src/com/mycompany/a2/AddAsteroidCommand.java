package com.mycompany.a2;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;

public class AddAsteroidCommand extends Command {
	
	//fields
	private GameWorld gw;
	
	//constructors
	public AddAsteroidCommand(GameWorld gw) {
		super("Add Asteroid" );
		this.gw = gw;	
	}
	
	//methods
	//only one method to override action perfomred
	
	@Override
	public void actionPerformed(ActionEvent e) {
		gw.createAstroid();
		//System.out.println("Add Asteroid");
		
	}
	
	

}
