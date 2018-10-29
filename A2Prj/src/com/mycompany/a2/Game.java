package com.mycompany.a2;

import com.codename1.charts.util.ColorUtil;

import com.codename1.ui.Button;
import com.codename1.ui.CheckBox;
import com.codename1.ui.ComboBox;
import com.codename1.ui.Command;
import com.codename1.ui.Component;
import com.codename1.ui.Container;
import com.codename1.ui.Dialog;
import com.codename1.ui.Form;
import com.codename1.ui.events.ActionListener;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.layouts.GridLayout;
import com.codename1.ui.plaf.Border;
import com.codename1.ui.TextField;
import com.codename1.ui.Toolbar;
import com.codename1.ui.events.ActionEvent;
import java.lang.String;
import com.codename1.ui.Label;




public class Game extends Form{
	private GameWorld gw;
	private MapView mv; //new 
	private PointsView pv; //new
	private static int width;
	private static int height;
	
	
	public Game() {
		gw = new GameWorld();
		pv = new PointsView();
		mv = new MapView(); // create an observer for the map
		 //create an "observer" for the points
		
		gw.addObserver(mv);
		//add(BorderLayout.CENTER, mv);//register the map observer
		gw.addObserver(pv); //register the points observer 
		setLayout(new BorderLayout());
		//add(BorderLayout.NORTH, pv);
 		gw.init(); 
		
		//code to create menus, create command objects for each command
		//add commands to command menu, create a control panel for the buttons
		//add buttons to the control panel, add commands to the buttons, and 
		//add control panel, mapView panel, and pointsView panel to the form
		
		
		//setLayout(new BorderLayout());
		
		/*Container topContainer = new Container(new GridLayout(1,2));
		topContainer.add(new Label("Asteroid Game"));
		topContainer.add(new Button("menu"));
		topContainer.getAllStyles().setBorder(Border.createLineBorder(4,ColorUtil.BLACK));
		topContainer.add(new ComboBox());
		add(BorderLayout.NORTH, topContainer);*/
		
		
		
		//--------------------------- Points Container---------------------------//
		/*Container pointsContainer = new Container(new GridLayout(1,2));
		pointsContainer.add(new Label("Points"));
		pointsContainer.getAllStyles().setBorder(Border.createLineBorder(4, ColorUtil.YELLOW));
		//pointsContainer.getAllStyles().setPadding(Component.B, 10);
		add(BorderLayout.NORTH, pointsContainer);*/
		//Container topContainer = new Container(pv);
		
 		add(BorderLayout.NORTH, pv);
		//--------------------------- Commands Container---------------------------//
		Container commandsContainer = new Container(new BoxLayout(BoxLayout.Y_AXIS)); //sets left contaienr to the west
		commandsContainer.getAllStyles().setPadding(Component.TOP, 50);
		commandsContainer.add(new Label("Command"));
		commandsContainer.getAllStyles().setBorder(Border.createLineBorder(4,ColorUtil.BLUE));
		//commandsContainer.add(addAsteroid);
		add(BorderLayout.WEST, commandsContainer);
		
		//---------------------------Map Container -------------------
		Container mapContainer = new Container();
		mapContainer.getAllStyles().setBgColor(ColorUtil.LTGRAY);
		//setting border color
		mapContainer.getAllStyles().setBorder(Border.createLineBorder(4,ColorUtil.MAGENTA));
		add(BorderLayout.CENTER, mapContainer);
		
		
		//add the new buttons that will be on the west border
		Button addAsteroid = new Button("Add Asteroid");
		Button addFlyingSaucer = new Button("Add Flying Saucer");
		Button addSpaceStation = new Button("Add Space Station");
		Button addShip = new Button("Add Ship");
		Button accelerate = new Button ("Acclerate");
		Button decelerate = new Button ("Decelerate");
		Button leftTurn = new Button ("Left Turn");
		Button rightTurn = new Button("Right Turn");
		Button fireMissile = new Button ("Fire Missile");
		Button hyperJump = new Button ("Hyperspace Jump");
		Button reloadMissiles = new Button ("Reload Missiles");
		Button missileKillsAsteroid = new Button ("Missile Kills ASteroid");
		Button missileStrikesFlyingSaucer = new Button ("Missile Strikes Flying Saucer");
		Button shipCrashesIntoAsteroid = new Button ("Ship Crashes Into Asteroid");
		Button shipHitsFlyingSaucer = new Button ("Ship Hits Flying Saucer");
		Button asteroidsCollide = new Button ("Asteroid Collide");
		Button asteroidWhacksSaucer = new Button ("Asteroid Whacks Saucer");
		Button gameClockTick = new Button ("Game Clock Tick");
		
		/*----------------------------------Add Asteroid Command--------------------------*/
		//cyan asteroid
		addAsteroid.getAllStyles().setBgTransparency(255);
		addAsteroid.getUnselectedStyle().setBgColor(ColorUtil.rgb(0, 150, 150));
		addAsteroid.getAllStyles().setFgColor(ColorUtil.rgb(255, 255, 255));
		
		//set some button padding
		addAsteroid.getAllStyles().setPadding(TOP, 1);
		addAsteroid.getAllStyles().setPadding(BOTTOM, 1);
		addAsteroid.getAllStyles().setBorder(Border.createLineBorder(4,ColorUtil.BLACK));
		
		//declare all the needed commands for the buttons, keys, and side bar
		AddAsteroidCommand myAddAsteroid = new AddAsteroidCommand(gw); 
		addAsteroid.setCommand(myAddAsteroid);
		//commands to the keys
		addKeyListener('a', myAddAsteroid);
		//addKeyListener('m', )
		//addComponent(addAsteroid);
		commandsContainer.add(addAsteroid);
		
	
		
		/*----------------------------------Add Flying Saucer Command--------------------------*/
		addFlyingSaucer.getAllStyles().setBgTransparency(255);
		addFlyingSaucer.getUnselectedStyle().setBgColor(ColorUtil.rgb(0, 150, 150));
		addFlyingSaucer.getAllStyles().setFgColor(ColorUtil.rgb(255, 255, 255));
						
		//set some button padding
		addFlyingSaucer.getAllStyles().setPadding(TOP, 1);
		addFlyingSaucer.getAllStyles().setPadding(BOTTOM, 1);
		addFlyingSaucer.getAllStyles().setBorder(Border.createLineBorder(4,ColorUtil.BLACK));

				
		//declare all the needed commands for the buttons, keys, and side bar
		AddFlyingSaucerCommand myAddFlyingSaucer = new AddFlyingSaucerCommand(gw); 
		addFlyingSaucer.setCommand(myAddFlyingSaucer);
		//commands to the keys
		addKeyListener('y', myAddFlyingSaucer);
		//addComponent(addAsteroid);
		commandsContainer.add(addFlyingSaucer);
		
		/*----------------------------------Add Space Station Command--------------------------*/
		//cyan asteroid
		addSpaceStation.getAllStyles().setBgTransparency(255);
		addSpaceStation.getUnselectedStyle().setBgColor(ColorUtil.rgb(0, 150, 150));
		addSpaceStation.getAllStyles().setFgColor(ColorUtil.rgb(255, 255, 255));
						
		//set some button padding
		addSpaceStation.getAllStyles().setPadding(TOP, 1);
		addSpaceStation.getAllStyles().setPadding(BOTTOM, 1);
		addSpaceStation.getAllStyles().setBorder(Border.createLineBorder(4,ColorUtil.BLACK));

				
		//declare all the needed commands for the buttons, keys, and side bar
		AddSpaceStationCommand myAddSpaceStation = new AddSpaceStationCommand(gw); 
		addSpaceStation.setCommand(myAddSpaceStation);
		//commands to the keys
		addKeyListener('b', myAddSpaceStation);
		//addComponent(addAsteroid);
		commandsContainer.add(addSpaceStation);
		
		
		/*----------------------------------Add Ship Command--------------------------*/
		//cyan asteroid
		addShip.getAllStyles().setBgTransparency(255);
		addShip.getUnselectedStyle().setBgColor(ColorUtil.rgb(0, 150, 150));
		addShip.getAllStyles().setFgColor(ColorUtil.rgb(255, 255, 255));
				
		//set some button padding
		addShip.getAllStyles().setPadding(TOP, 1);
		addShip.getAllStyles().setPadding(BOTTOM, 1);
		addShip.getAllStyles().setBorder(Border.createLineBorder(4,ColorUtil.BLACK));

		//declare all the needed commands for the buttons, keys, and side bar
		AddShipCommand myAddShip = new AddShipCommand(gw); 
		addShip.setCommand(myAddShip);
		//commands to the keys
		addKeyListener('s', myAddShip);
		//addComponent(addAsteroid);
		commandsContainer.add(addShip);
		
		/*----------------------------------Add Accelerate Command--------------------------*/
		//cyan asteroid
		accelerate.getAllStyles().setBgTransparency(255);
		accelerate.getUnselectedStyle().setBgColor(ColorUtil.rgb(0, 150, 150));
		accelerate.getAllStyles().setFgColor(ColorUtil.rgb(255, 255, 255));
						
		//set some button padding
		accelerate.getAllStyles().setPadding(TOP, 1);
		accelerate.getAllStyles().setPadding(BOTTOM, 1);
		accelerate.getAllStyles().setBorder(Border.createLineBorder(4,ColorUtil.BLACK));

				
		//declare all the needed commands for the buttons, keys, and side bar
		AccelerateCommand myAccelerate = new AccelerateCommand(gw); 
		accelerate.setCommand(myAccelerate);
		//commands to the keys
		addKeyListener('i', myAccelerate);
		addKeyListener(-91, myAccelerate);
		//addComponent(addAsteroid);
		commandsContainer.add(accelerate);
		
		
		/*----------------------------------Add Decelerate Command--------------------------*/
		//cyan asteroid
		decelerate.getAllStyles().setBgTransparency(255);
		decelerate.getUnselectedStyle().setBgColor(ColorUtil.rgb(0, 150, 150));
		decelerate.getAllStyles().setFgColor(ColorUtil.rgb(255, 255, 255));
						
		//set some button padding
		decelerate.getAllStyles().setPadding(TOP, 1);
		decelerate.getAllStyles().setPadding(BOTTOM, 1);
		decelerate.getAllStyles().setBorder(Border.createLineBorder(4,ColorUtil.BLACK));

		//declare all the needed commands for the buttons, keys, and side bar
		DecelerateCommand myDecelerate= new DecelerateCommand(gw); 
		decelerate.setCommand(myDecelerate);
		//commands to the keys
		addKeyListener('d',myDecelerate);
		addKeyListener(-92, myDecelerate);
		//addComponent(addAsteroid);
		commandsContainer.add(decelerate);
		
		/*----------------------------------Add Left Turn Command--------------------------*/
		//cyan asteroid
		leftTurn.getAllStyles().setBgTransparency(255);
		leftTurn.getUnselectedStyle().setBgColor(ColorUtil.rgb(0, 150, 150));
		leftTurn.getAllStyles().setFgColor(ColorUtil.rgb(255, 255, 255));
						
		//set some button padding
		leftTurn.getAllStyles().setPadding(TOP, 1);
		leftTurn.getAllStyles().setPadding(BOTTOM, 1);
		leftTurn.getAllStyles().setBorder(Border.createLineBorder(4,ColorUtil.BLACK));

		//declare all the needed commands for the buttons, keys, and side bar
		LeftTurnCommand myLeftTurn = new LeftTurnCommand(gw); 
		leftTurn.setCommand(myLeftTurn);
		//commands to the keys
		addKeyListener('l', myLeftTurn);
		addKeyListener(-93, myLeftTurn);
		//addComponent(addAsteroid);
		commandsContainer.add(leftTurn);
		
		/*----------------------------------Add Right Turn Command--------------------------*/
		rightTurn.getAllStyles().setBgTransparency(255);
		rightTurn.getUnselectedStyle().setBgColor(ColorUtil.rgb(0, 150, 150));
		rightTurn.getAllStyles().setFgColor(ColorUtil.rgb(255, 255, 255));
						
		//set some button padding
		rightTurn.getAllStyles().setPadding(TOP, 1);
		rightTurn.getAllStyles().setPadding(BOTTOM, 1);
		rightTurn.getAllStyles().setBorder(Border.createLineBorder(4,ColorUtil.BLACK));

		//declare all the needed commands for the buttons, keys, and side bar
		TurnRightCommand myRightTurn = new TurnRightCommand(gw); 
		rightTurn.setCommand(myRightTurn);
		//commands to the keys
		addKeyListener('r', myRightTurn);
		addKeyListener(-94, myRightTurn);
		//addComponent(addAsteroid);
		commandsContainer.add(rightTurn);
		/*----------------------------------Add Fire Missile Command--------------------------*/
		fireMissile.getAllStyles().setBgTransparency(255);
		fireMissile.getUnselectedStyle().setBgColor(ColorUtil.rgb(0, 150, 150));
		fireMissile.getAllStyles().setFgColor(ColorUtil.rgb(255, 255, 255));
						
		//set some button padding
		fireMissile.getAllStyles().setPadding(TOP, 1);
		fireMissile.getAllStyles().setPadding(BOTTOM, 1);
		fireMissile.getAllStyles().setBorder(Border.createLineBorder(4,ColorUtil.BLACK));

		//declare all the needed commands for the buttons, keys, and side bar
		FireMissileCommand myFireMissile = new FireMissileCommand(gw);
		//commands to the keys
		addKeyListener('f', myFireMissile);
		addKeyListener(-90, myFireMissile);
		//addComponent(addAsteroid);
		commandsContainer.add(fireMissile);
		/*----------------------------------Add HyperSpace Jump Command--------------------------*/
		hyperJump.getAllStyles().setBgTransparency(255);
		hyperJump.getUnselectedStyle().setBgColor(ColorUtil.rgb(0, 150, 150));
		hyperJump.getAllStyles().setFgColor(ColorUtil.rgb(255, 255, 255));
						
		//set some button padding
		hyperJump.getAllStyles().setPadding(TOP, 1);
		hyperJump.getAllStyles().setPadding(BOTTOM, 1);
		hyperJump.getAllStyles().setBorder(Border.createLineBorder(4,ColorUtil.BLACK));

		//declare all the needed commands for the buttons, keys, and side bar
		JumpCommand myJump = new JumpCommand(gw); 
		hyperJump.setCommand(myJump);
		//commands to the keys
		addKeyListener('j', myJump);
		//addComponent(addAsteroid);
		commandsContainer.add(hyperJump);
	
		/*----------------------------------Add Reload Missiles Command--------------------------*/
		reloadMissiles.getAllStyles().setBgTransparency(255);
		reloadMissiles.getUnselectedStyle().setBgColor(ColorUtil.rgb(0, 150, 150));
		reloadMissiles.getAllStyles().setFgColor(ColorUtil.rgb(255, 255, 255));
						
		//set some button padding
		reloadMissiles.getAllStyles().setPadding(TOP, 1);
		reloadMissiles.getAllStyles().setPadding(BOTTOM, 1);
		reloadMissiles.getAllStyles().setBorder(Border.createLineBorder(4,ColorUtil.BLACK));

		//declare all the needed commands for the buttons, keys, and side bar
		ReloadMissilesCommand myReload = new ReloadMissilesCommand(gw); 
		reloadMissiles.setCommand(myReload);
		//commands to the keys
		addKeyListener('n', myReload);
		//addComponent(addAsteroid);
		commandsContainer.add(reloadMissiles);
		
		/*----------------------------------Add Missiles Kills Asteroid Command--------------------------*/
		missileKillsAsteroid.getAllStyles().setBgTransparency(255);
		missileKillsAsteroid.getUnselectedStyle().setBgColor(ColorUtil.rgb(0, 150, 150));
		missileKillsAsteroid.getAllStyles().setFgColor(ColorUtil.rgb(255, 255, 255));
						
		//set some button padding
		missileKillsAsteroid.getAllStyles().setPadding(TOP, 1);
		missileKillsAsteroid.getAllStyles().setPadding(BOTTOM, 1);
		missileKillsAsteroid.getAllStyles().setBorder(Border.createLineBorder(4,ColorUtil.BLACK));

		//declare all the needed commands for the buttons, keys, and side bar
		MissileKillsAsteroidCommand myMissileKillsAsteroid = new MissileKillsAsteroidCommand(gw); 
		missileKillsAsteroid.setCommand(myMissileKillsAsteroid);
		//commands to the keys
		addKeyListener('k', myMissileKillsAsteroid);
		//addComponent(addAsteroid);
		commandsContainer.add(missileKillsAsteroid);
		
		/*----------------------------------Add Missile Strikes Flying Saucer Command--------------------------*/
		missileStrikesFlyingSaucer.getAllStyles().setBgTransparency(255);
		missileStrikesFlyingSaucer.getUnselectedStyle().setBgColor(ColorUtil.rgb(0, 150, 150));
		missileStrikesFlyingSaucer.getAllStyles().setFgColor(ColorUtil.rgb(255, 255, 255));
						
		//set some button padding
		missileStrikesFlyingSaucer.getAllStyles().setPadding(TOP, 1);
		missileStrikesFlyingSaucer.getAllStyles().setPadding(BOTTOM, 1);
		missileStrikesFlyingSaucer.getAllStyles().setBorder(Border.createLineBorder(4,ColorUtil.BLACK));

		//declare all the needed commands for the buttons, keys, and side bar
		MissileKillsFlyingSaucerCommand myMissileKillsFlyingSaucer = new MissileKillsFlyingSaucerCommand(gw); 
		missileStrikesFlyingSaucer.setCommand(myMissileKillsFlyingSaucer);
		//commands to the keys
		addKeyListener('e', myMissileKillsFlyingSaucer);
		//addComponent(addAsteroid);
		commandsContainer.add(missileStrikesFlyingSaucer);
		
		/*----------------------------------Add Ship Crashes Into Asteroid Command--------------------------*/
		shipCrashesIntoAsteroid.getAllStyles().setBgTransparency(255);
		shipCrashesIntoAsteroid.getUnselectedStyle().setBgColor(ColorUtil.rgb(0, 150, 150));
		shipCrashesIntoAsteroid.getAllStyles().setFgColor(ColorUtil.rgb(255, 255, 255));
						
		//set some button padding
		shipCrashesIntoAsteroid.getAllStyles().setPadding(TOP, 1);
		shipCrashesIntoAsteroid.getAllStyles().setPadding(BOTTOM, 1);
		shipCrashesIntoAsteroid.getAllStyles().setBorder(Border.createLineBorder(4,ColorUtil.BLACK));

		//declare all the needed commands for the buttons, keys, and side bar
		ShipCrashesIntoAsteroidCommand myShipCrashesIntoAsteroid = new ShipCrashesIntoAsteroidCommand(gw); 
		shipCrashesIntoAsteroid.setCommand(myShipCrashesIntoAsteroid);
		//commands to the keys
		addKeyListener('c', myShipCrashesIntoAsteroid);
		//addComponent(addAsteroid);
		commandsContainer.add(shipCrashesIntoAsteroid);
		
		/*----------------------------------Add Ship Hits Flying Saucer Command--------------------------*/
		shipHitsFlyingSaucer.getAllStyles().setBgTransparency(255);
		shipHitsFlyingSaucer.getUnselectedStyle().setBgColor(ColorUtil.rgb(0, 150, 150));
		shipHitsFlyingSaucer.getAllStyles().setFgColor(ColorUtil.rgb(255, 255, 255));
						
		//set some button padding
		shipHitsFlyingSaucer.getAllStyles().setPadding(TOP, 1);
		shipHitsFlyingSaucer.getAllStyles().setPadding(BOTTOM, 1);
		shipHitsFlyingSaucer.getAllStyles().setBorder(Border.createLineBorder(4,ColorUtil.BLACK));

		//declare all the needed commands for the buttons, keys, and side bar
		ShipHitsFlyingSaucerCommand myShipHitsFlyingSaucer = new ShipHitsFlyingSaucerCommand(gw); 
		shipHitsFlyingSaucer.setCommand(myShipHitsFlyingSaucer);
		//commands to the keys
		addKeyListener('h', myShipHitsFlyingSaucer);
		//addComponent(addAsteroid);
		commandsContainer.add(shipHitsFlyingSaucer);
		
		/*----------------------------------Add Asteroids Collide Command--------------------------*/
		asteroidsCollide.getAllStyles().setBgTransparency(255);
		asteroidsCollide.getUnselectedStyle().setBgColor(ColorUtil.rgb(0, 150, 150));
		asteroidsCollide.getAllStyles().setFgColor(ColorUtil.rgb(255, 255, 255));
						
		//set some button padding
		asteroidsCollide.getAllStyles().setPadding(TOP, 1);
		asteroidsCollide.getAllStyles().setPadding(BOTTOM, 1);
		asteroidsCollide.getAllStyles().setBorder(Border.createLineBorder(4,ColorUtil.BLACK));

		//declare all the needed commands for the buttons, keys, and side bar
		AsteroidCollideCommand myAsteroidsCollide = new AsteroidCollideCommand(gw); 
		asteroidsCollide.setCommand(myAsteroidsCollide);
		//commands to the keys
		addKeyListener('x', myAsteroidsCollide);
		//addComponent(addAsteroid);
		commandsContainer.add(asteroidsCollide);
		
		/*----------------------------------Add Asteroid Whacks Saucer Command--------------------------*/
		asteroidWhacksSaucer.getAllStyles().setBgTransparency(255);
		asteroidWhacksSaucer.getUnselectedStyle().setBgColor(ColorUtil.rgb(0, 150, 150));
		asteroidWhacksSaucer.getAllStyles().setFgColor(ColorUtil.rgb(255, 255, 255));
						
		//set some button padding
		asteroidWhacksSaucer.getAllStyles().setPadding(TOP, 1);
		asteroidWhacksSaucer.getAllStyles().setPadding(BOTTOM, 1);
		asteroidWhacksSaucer.getAllStyles().setBorder(Border.createLineBorder(4,ColorUtil.BLACK));

		//declare all the needed commands for the buttons, keys, and side bar
		AsteroidWhacksSaucerCommand myAsteroidWhacksSaucer = new AsteroidWhacksSaucerCommand(gw); 
		asteroidWhacksSaucer.setCommand(myAsteroidWhacksSaucer);
		//commands to the keys
		addKeyListener('I', myAsteroidWhacksSaucer);
		//addComponent(addAsteroid);
		commandsContainer.add(asteroidWhacksSaucer);
		
		/*----------------------------------Add Reload Missiles Command--------------------------*/
		gameClockTick.getAllStyles().setBgTransparency(255);
		gameClockTick.getUnselectedStyle().setBgColor(ColorUtil.rgb(0, 150, 150));
		gameClockTick.getAllStyles().setFgColor(ColorUtil.rgb(255, 255, 255));
						
		//set some button padding
		gameClockTick.getAllStyles().setPadding(TOP, 1);
		gameClockTick.getAllStyles().setPadding(BOTTOM, 1);
		gameClockTick.getAllStyles().setBorder(Border.createLineBorder(4,ColorUtil.BLACK));

		//declare all the needed commands for the buttons, keys, and side bar
		ClockCommand myClock = new ClockCommand(gw); 
		gameClockTick.setCommand(myClock);
		//commands to the keys
		addKeyListener('t', myClock);
		//addComponent(addAsteroid);
		commandsContainer.add(gameClockTick);
		
		
		Toolbar myToolbar = new Toolbar();
		setToolbar(myToolbar);
		//add text field to title
		TextField myTF = new TextField();
		myToolbar.setTitle("Asteroid Game");
		//AddAsteroidCommand myAddAsteroid = new AddAsteroidCommand(gw); 
		
		
		myToolbar.addCommandToOverflowMenu(myAddAsteroid); //a
		myToolbar.addCommandToOverflowMenu(myAddSpaceStation); //b
		myToolbar.addCommandToOverflowMenu(myAddShip); //s
		myToolbar.addCommandToOverflowMenu(myReload); //n
		myToolbar.addCommandToOverflowMenu(myMissileKillsAsteroid); //k
		myToolbar.addCommandToOverflowMenu(myShipCrashesIntoAsteroid); //c
		myToolbar.addCommandToOverflowMenu(myAsteroidsCollide);//x
		myToolbar.addCommandToOverflowMenu(myClock); //t
		QuitCommand myQuit = new QuitCommand(gw);
		myToolbar.addCommandToOverflowMenu(myQuit);//q
	

		





		
		//myToolbar.addComponentToSideMenu();
		//myToolbar.setCommand
		Command file = new Command("File");
		myToolbar.addCommandToSideMenu(file);
		Command save = new Command("Save");
		myToolbar.addCommandToSideMenu(save);
		Command Undo = new Command("Undo");
		myToolbar.addCommandToSideMenu(Undo);
		
		AddAboutCommand myAbout = new AddAboutCommand(gw);
		myToolbar.addCommandToSideMenu(myAbout);

		//Command quit = new Command("Quit");
		myToolbar.addCommandToSideMenu(myQuit);
		
		//CheckBox soundCheck = new CheckBox("Sound");
		AddSoundCommand mySound = new AddSoundCommand(gw);
		
		CheckBox soundCheck = new CheckBox("Sound");
		soundCheck.setCommand(mySound);
		soundCheck.setComponentState(true);
		myToolbar.addComponentToSideMenu(soundCheck);
		//add label to indicate check box value on the form, divide label to two parts, text
		//and value, and add padding to value part so that the labels look stable when value changes
		//Label checkStatusText = new Label ("Check Sound Status: ");
		//checkStatusText.getAllStyles().setPadding(LEFT, 5);
		//checkStatusText.getAllStyles().setPadding(RIGHT, 5);
		
		
	
		this.addKeyListener('m', new MapCommand(gw));

		
		this.show();
		
		width = mv.getWidth();
		height = mv.getHeight();
	}
	
	
	
	public static int getMapWidth() {
		return width;
	}
	
	public static int getMapHeight() {
		return height;
	}
	

}
