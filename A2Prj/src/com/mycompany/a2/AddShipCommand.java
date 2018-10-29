package com.mycompany.a2;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;

public class AddShipCommand extends Command{
	//fields
		private GameWorld gw;
		
		//constructors
		public AddShipCommand(GameWorld gw) {
			super("Add Ship" );
			this.gw = gw;	
		}
		
		//methods
		//only one method to override action perfomred
		
		@Override
		public void actionPerformed(ActionEvent e) {
			gw.createPlayerShip();
			//System.out.println("Add Asteroid");
			
		}
		

}
