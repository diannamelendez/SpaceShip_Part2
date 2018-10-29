package com.mycompany.a2;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;

public class MapCommand extends Command {
	
	//fields
		private GameWorld gw;
		
		//constructors
		public MapCommand(GameWorld gw) {
			super("Map");
			this.gw = gw;	
		}
		
		//methods
		//only one method to override action perfomred
		
		@Override
		public void actionPerformed(ActionEvent e) {
			gw.printWorldStatus();
			//System.out.println("Add Asteroid");
			
		}
		

}