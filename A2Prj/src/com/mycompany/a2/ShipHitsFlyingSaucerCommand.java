package com.mycompany.a2;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;

public class ShipHitsFlyingSaucerCommand extends Command {
	
	//fields
	private GameWorld gw;
	
	//constructors
	public ShipHitsFlyingSaucerCommand(GameWorld gw) {
		super("Ship Hits Flying Saucer");
		this.gw = gw;	
	}
	
	//methods
	//only one method to override action perfomred
	
	@Override
	public void actionPerformed(ActionEvent e) {
		gw.hitNPS();
		//System.out.println("Add Asteroid");
		
	}
	
	

}
