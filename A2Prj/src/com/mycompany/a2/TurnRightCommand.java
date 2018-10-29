package com.mycompany.a2;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;

public class TurnRightCommand extends Command {
	
	//fields
	GameWorld gw;
		
	//constructors
	public TurnRightCommand(GameWorld gw) {
		super("Right Turn");
		this.gw = gw;	
	}
		
	//methods
	//only one method to override action perfomred
		
	@Override
	public void actionPerformed(ActionEvent e) {
		gw.turnRight();
		//System.out.println("Add Asteroid");
			
	}
		

}
