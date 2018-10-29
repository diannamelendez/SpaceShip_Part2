package com.mycompany.a2;

import java.util.Observable;
import java.util.Observer;

import com.codename1.charts.util.ColorUtil;
import com.codename1.ui.Container;
import com.codename1.ui.Label;
import com.codename1.ui.plaf.Border;

//this class is an observer that represents the map view of the game. it's a container that is given to Gameworld
//doesn't actually do anything graphics-wise, just prints the text

public class MapView extends Container implements Observer {

	private Label label = new Label("hkhl");
	
	MapView(){
		this.getAllStyles().setBorder(Border.createLineBorder(4, ColorUtil.YELLOW));
		//getAllStyles.setBgColor(ColorUtil.GRAY);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		//code to update labels from data in observable 
		
		
		
	}
}

