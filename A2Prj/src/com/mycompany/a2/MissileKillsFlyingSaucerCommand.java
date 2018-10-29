package com.mycompany.a2;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;

public class MissileKillsFlyingSaucerCommand extends Command {
	
	//fields
	private GameWorld gw;
	
	//constructors
	public MissileKillsFlyingSaucerCommand(GameWorld gw) {
		super("Missile Strikes Flying Saucer" );
		this.gw = gw;	
	}
	
	//methods
	//only one method to override action perfomred
	
	@Override
	public void actionPerformed(ActionEvent e) {
		gw.eliminatedNPS();
		
	}
	
	

}
