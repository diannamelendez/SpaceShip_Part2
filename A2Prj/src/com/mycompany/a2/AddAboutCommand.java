package com.mycompany.a2;

import com.codename1.ui.Command;
import com.codename1.ui.Dialog;
import com.codename1.ui.events.ActionEvent;

public class AddAboutCommand extends Command {
	
	//fields
		private GameWorld gw;
		
		//constructors
		public AddAboutCommand(GameWorld gw) {
			super("About");
			this.gw = gw;	
		}
		
		//methods
		//only one method to override action perfomred
		
		@Override
		public void actionPerformed(ActionEvent e) {
			String Message = ("Dianna Melendez \n CSC 133 \n A2");
			Dialog.show("About", Message, "Ok", null);
		}
		

}
