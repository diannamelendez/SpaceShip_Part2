package com.mycompany.a2;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;

public class AddFlyingSaucerCommand extends Command {
	
	GameWorld gw;
	
	public AddFlyingSaucerCommand(GameWorld gw) {
		super("Add Flying Saucer");
		this.gw = gw;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		gw.createNPS();
		//System.out.println("Add Asteroid");
		
	}

}
