package com.mycompany.a2;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;

public class AddSpaceStationCommand extends Command {
	
	//fields
	private GameWorld gw;
		
		//constructors
	public AddSpaceStationCommand(GameWorld gw) {
		super("Add Space Station");
		this.gw = gw;	
	}
		
		//methods
		//only one method to override action perfomred
		
	@Override
	public void actionPerformed(ActionEvent e) {
		gw.createSpaceStation();
			//System.out.println("Add Asteroid");
			
	}
		

}

