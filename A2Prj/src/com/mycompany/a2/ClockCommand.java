package com.mycompany.a2;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;

public class ClockCommand extends Command {
	
	//fields
	private GameWorld gw;
	
	//constructors
	public ClockCommand(GameWorld gw) {
		super("Game Clock Tick" );
		this.gw = gw;	
	}
	
	//methods
	//only one method to override action perfomred
	
	@Override
	public void actionPerformed(ActionEvent e) {
		gw.gameClock();
		//System.out.println("Add Asteroid");
		
	}
	
	

}