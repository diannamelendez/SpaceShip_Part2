package com.mycompany.a2;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;

public class QuitCommand extends Command {
	
	//fields
		private GameWorld gw;
		
		//constructors
		public QuitCommand(GameWorld gw) {
			super("Quit");
			this.gw = gw;	
		}
		
		//methods
		//only one method to override action perfomred
		
		@Override
		public void actionPerformed(ActionEvent e) {
			gw.quit();
			//System.out.println("Add Asteroid");
			
		}
		

}
