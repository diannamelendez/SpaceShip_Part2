package com.mycompany.a2;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;

public class MissileKillsAsteroidCommand extends Command {
	
	//fields
	private GameWorld gw;
	
	//constructors
	public MissileKillsAsteroidCommand(GameWorld gw) {
		super("Missile Kills Asteroid" );
		this.gw = gw;	
	}
	
	//methods
	//only one method to override action perfomred
	
	@Override
	public void actionPerformed(ActionEvent e) {
		gw.killedAstroid();
		//System.out.println("Add Asteroid");
		
	}
	
	

}