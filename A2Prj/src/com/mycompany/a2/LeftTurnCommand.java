package com.mycompany.a2;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;

public class LeftTurnCommand extends Command {
	
	//fields
		private GameWorld gw;
		
		//constructors
		public LeftTurnCommand(GameWorld gw) {
			super("Left Turn");
			this.gw = gw;	
		}
		
		//methods
		//only one method to override action perfomred
		
		@Override
		public void actionPerformed(ActionEvent e) {
			gw.turnLeft();
			//System.out.println("Add Asteroid");
			
		}
		

}

