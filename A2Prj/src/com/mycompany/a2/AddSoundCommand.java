package com.mycompany.a2;

import com.codename1.ui.CheckBox;
import com.codename1.ui.Command;
import com.codename1.ui.Label;
import com.codename1.ui.events.ActionEvent;

public class AddSoundCommand extends Command {
	
	//fields
		private static GameWorld gw;
		private static AddSoundCommand sound;
		
		//constructors
		public AddSoundCommand(GameWorld gw) {
			super("Sound");
			this.gw = gw;	
		}
		
		//methods
		//only one method to override action perfomred
		
		public static AddSoundCommand getInstance() {
			if (sound == null) {
					sound = new AddSoundCommand(gw);
			}
			return sound;
		}
		
		public static void setGW(GameWorld tgw) {
			if (gw == null) {
				gw = tgw;
			}
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			System.out.println("Toggle sound requested from " + e.getCommand() + " " + e.getSource().getClass());
			
			if (gw != null) {
				gw.toggleSound();
			}
			else {
				System.out.println("Command received");
				
			}
			
			//gw.toggleSound();
			//System.out.println("Add Asteroid");
			
		}
		

}














