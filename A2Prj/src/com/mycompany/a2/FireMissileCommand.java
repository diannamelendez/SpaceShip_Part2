package com.mycompany.a2;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;

public class FireMissileCommand extends Command {
	
	//fields
		private GameWorld gw;
		
		//constructors
		public FireMissileCommand(GameWorld gw) {
			super("Fire Missile");
			this.gw = gw;	
		}
		
		//methods
		//only one method to override action perfomred
		
		@Override
		public void actionPerformed(ActionEvent e) {
			gw.firePSMissile();
			//System.out.println("Add Asteroid");
			
		}
		

}

