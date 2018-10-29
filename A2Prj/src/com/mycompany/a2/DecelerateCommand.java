package com.mycompany.a2;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;

public class DecelerateCommand extends Command {
	
	//fields
		private GameWorld gw;
		
		//constructors
		public DecelerateCommand(GameWorld gw) {
			super("Decelerate");
			this.gw = gw;	
		}
		
		//methods
		//only one method to override action perfomred
		
		@Override
		public void actionPerformed(ActionEvent e) {
			gw.decreasePSpeed();
			//System.out.println("Add Asteroid");
			
		}
		

}

