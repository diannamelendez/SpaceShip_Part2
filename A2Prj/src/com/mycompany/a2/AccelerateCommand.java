package com.mycompany.a2;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;

public class AccelerateCommand extends Command {
	
	//fields
		private GameWorld gw;
		
		//constructors
		public AccelerateCommand(GameWorld gw) {
			super("Accelerate");
			this.gw = gw;	
		}
		
		//methods
		//only one method to override action perfomred
		
		@Override
		public void actionPerformed(ActionEvent e) {
			gw.increasePSpeed();
			//System.out.println("Add Asteroid");
			
		}
		

}

