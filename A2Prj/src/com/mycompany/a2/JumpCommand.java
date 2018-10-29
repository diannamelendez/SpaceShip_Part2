package com.mycompany.a2;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;

public class JumpCommand extends Command {
	
	//fields
		private GameWorld gw;
		
		//constructors
		public JumpCommand(GameWorld gw) {
			super("HypserSpace Jump");
			this.gw = gw;	
		}
		
		//methods
		//only one method to override action perfomred
		
		@Override
		public void actionPerformed(ActionEvent e) {
			gw.centerShip();
			
			
		}
		

}

