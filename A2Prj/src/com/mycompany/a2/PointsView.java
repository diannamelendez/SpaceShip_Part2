package com.mycompany.a2;

import java.util.Observable;
import java.util.Observer;

import com.codename1.charts.util.ColorUtil;
import com.codename1.ui.Container;
import com.codename1.ui.Label;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.layouts.GridLayout;
import com.codename1.ui.plaf.Border;

public class PointsView extends Container implements Observer {
	
	//private Label pointsValueLabel;
	private Label time;
	private Label missileCount;
	private Label sound;
	private Label lives;
	//private int gameTime;
	
	private Label playerScore;
	
	public PointsView() {
		//instantiate text labels
		
		//this.setLayout(new BoxLayout(BoxLayout.X_AXIS));
		Label playerScore =new Label("Points: \t");
		playerScore.getAllStyles().setFgColor(ColorUtil.rgb(0, 0, 255));
		Label time = new Label("Elapsed Time: \t");
		time.getAllStyles().setFgColor(ColorUtil.rgb(0, 0, 255));
		Label missileCount = new Label("Missile count: \t");
		missileCount.getAllStyles().setFgColor(ColorUtil.rgb(0, 0, 255));
		Label sound = new Label("Sound: \t");
		sound.getAllStyles().setFgColor(ColorUtil.rgb(0, 0, 255));
		Label lives = new Label("Lives: \t");
		lives.getAllStyles().setFgColor(ColorUtil.rgb(0, 0, 255));
	
		
		
		Container pointsContainer = new Container();
		pointsContainer.setLayout(new BoxLayout(BoxLayout.X_AXIS));
		
		pointsContainer.add(playerScore);
		
		pointsContainer.add(time);
		
		pointsContainer.add(missileCount);
		
		pointsContainer.add(sound);
	
		pointsContainer.add(lives);
		this.add(pointsContainer);
		
		
		//pointsContainer.getAllStyles().setBorder(Border.createLineBorder(4, ColorUtil.YELLOW));
		//pointsContainer.getAllStyles().setPadding(Component.B, 10);
		//add(BorderLayout.NORTH, pointsContainer);
		//this.add(pointsContainer);
		
		
		
	}
	
	
	

	
	@Override
	public void update(Observable o, Object arg) {
		// code to update labels from data in observable
		//String string = (String)((GameWorld) o)).gameClock();
		//time.setText((GameWorld)o).gameClock();
		//lives.setText("Lives Left: " + ((GameWorld) o).getLivesLeft());
		
		//casting arg as gameWorld
		IGameWorld gw = (IGameWorld) arg;
		
		//getting player score
		int score = gw.getPlayerScore();
		playerScore.setText("" + (score> 00 ? "" : "0") + (score > 9 ? "" : "0") + score);
		
		int livesleft = gw.getLives();
		lives.setText("Lives: " + livesleft);
		
		
		int elapsedTime = gw.getClockTime();
		time.setText("Elapsed Time: " + elapsedTime);
		
		//int missilesLeft = gw.getMissileCount();
		//missileCount.setText("Missile count: " + missilesLeft);
		
		if(((GameWorld)o).soundIsOn()) {
			sound.setText("Sound: ON");
		}
		else {
			sound.setText("Sound: OFF");
		}
		
		//this.setVisible(true);
		this.repaint();
		
		
	}

}
