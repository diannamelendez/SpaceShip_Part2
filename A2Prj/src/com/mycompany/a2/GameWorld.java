package com.mycompany.a2;




import java.util.Observable;
import java.util.ArrayList;
import java.util.Random;


//import com.mycompany.a1.NonPlayerShip;


public class GameWorld extends Observable implements IGameWorld{
	//code to hold and manipulate world objects, handle observer registration,
	//invoke observer callbacks by passing a gameWorld proxy, etc.
	
	
	Random random = new Random();
	//ector store;
	boolean sound = true;
	
	ArrayList<GameObject> store = new ArrayList<GameObject>();
	int lives;
	int gameTime;
	int playerScore;
	PlayerShip ps;
	GameCollection myGameObjects = new GameCollection();
	
	public GameWorld() { //constructor sets all state values appropriately. also creates collection necessary to hold game objects
		
		//this.init();
		//store = new ArrayList<>();
	}
	
	public void init() {
		
		lives = 3;
		gameTime = 0;
		
			
		
		
	}
	
	//'a'
	public void createAstroid() {
		//create an asteroid object
		Astroid astroid = new Astroid();
		//add astroid to storage vector
		store.add(astroid);
		//tell user you created an astroid
		//tellObservers();
		System.out.println("A new ASTEROID has been created.");
	
	}
	
	//'y'
	public void createNPS() {
		//created nps object
		NonPlayerShip nps = new NonPlayerShip();
				//add it to storage vector
		store.add(nps);
		//tellObservers();
				//tell user you made an nps
		System.out.println("A new Non Player Ship has been created.");
				
		
	
		
	}

	//'b'
	public void createSpaceStation() {
		SpaceStation spaceStation = new SpaceStation();
		store.add(spaceStation);
		//tellObservers();
		System.out.println("A new Space Station has been created.");
	}
	
	//'s'
	public void createPlayerShip() {
		/*IIterator anIterator = store.getIterator();
		Object currentObj = new Object();
		while(anIterator.hasNext()) {
			currentObj = anIterator.next();
			if(currentObj instanceof PlayerShip) {
				System.out.println("A player ship already exists.");
			}
			else if(currentObj instanceof PlayerShip){*/
		PlayerShip ps = new PlayerShip();
				//add it to storage vector
		store.add(ps);
			
				//tell user you made an nps
		System.out.println("A new Player Ship has been created.");
		ps.setMissile(10);
			
			
		SteerableMissileLauncher mL = new SteerableMissileLauncher();
		store.add(mL);
				
		
		
		
		

	}
		
		
	
	//e'
	public void eliminateNPS() { //a player ship has hit a non player ship. Remove a non player ship from array as well as a missile
		IIterator anIterator = myGameObjects.getIterator();
		Object currentObj = new Object();
		while(anIterator.hasNext()) {
			currentObj = anIterator.next();
			if(currentObj instanceof NonPlayerShip) {
				store.remove(currentObj);
			}
			if (currentObj instanceof Missile) {
				store.remove(currentObj);
			
			}
		}
		
				//mObj.toString();
		
		
	}
	
	//'i'
	public void increasePSpeed() { //Increase speed of player ship
		IIterator anIterator = myGameObjects.getIterator();
		Object currentObj = new Object();
		while(anIterator.hasNext()) {
			currentObj = anIterator.next();
			if (currentObj instanceof PlayerShip) {
				PlayerShip ps = (PlayerShip)currentObj;
				ps.increaseSpeed(5);
				
			}
			
		
		 }
	}

	//'d'
	public void decreasePSpeed() { //decrease speeed of player ship
		IIterator anIterator = myGameObjects.getIterator();
		Object currentObj = new Object();
		while(anIterator.hasNext()) {
			currentObj = anIterator.next();
			if (currentObj instanceof PlayerShip) {
				PlayerShip ps = (PlayerShip)currentObj;
				ps.decreaseSpeed(5);
			
			}
		
		 }
		
	}
	
	//'l'
	public void turnLeft() { //tells ship to steer left
		IIterator anIterator = myGameObjects.getIterator();
		Object currentObj = new Object();
		while(anIterator.hasNext()) {
			currentObj = anIterator.next();
			if (currentObj instanceof PlayerShip) {
				PlayerShip ps = (PlayerShip)currentObj;
				ps.steer(false, 10);
			
			}
		
			
		}
	}
	
	//'r'
	public void turnRight() {
		IIterator anIterator = myGameObjects.getIterator();
		Object currentObj = new Object();
		while(anIterator.hasNext()) {
			currentObj = anIterator.next();
			if (currentObj instanceof PlayerShip) {
				PlayerShip ps = (PlayerShip)currentObj;
				ps.steer(true, 10);
				
			}
		}
	}
	
	
	
	//'<'
	public void turnMissileLauncher() {
		IIterator anIterator = myGameObjects.getIterator();
		Object currentObj = new Object();
		while(anIterator.hasNext()) {
			currentObj = anIterator.next();
			if (currentObj instanceof SteerableMissileLauncher) {
				SteerableMissileLauncher mL = (SteerableMissileLauncher)currentObj;
				mL.steer(false, 10);
				
			}
		}
		
	}
	
	//'f'
	public void firePSMissile() {
		IIterator anIterator = myGameObjects.getIterator();
		Object currentObj = new Object();
		while(anIterator.hasNext()) {
			currentObj = anIterator.next();
			if (currentObj instanceof PlayerShip) {
				PlayerShip ps = (PlayerShip)currentObj;
				if (ps.getMissileCount() > 0) {
					Missile missile = new Missile();
					store.add(missile);
				
				}
			}
				
		}
		
	}
	
	//'L'
	public void fireNPSMissile() {
		IIterator anIterator = myGameObjects.getIterator();
		Object currentObj = new Object();
		while(anIterator.hasNext()) {
			currentObj = anIterator.next();
			if (currentObj instanceof NonPlayerShip) {
				NonPlayerShip nps = (NonPlayerShip)currentObj;
				if (nps.getMissileCount() == 0) {
					System.out.println("no more missiles");
				
				}
				else {
					Missile missile = new Missile();
					store.add(missile);
				
				}
			}
			else {
				System.out.println("no more missiles");
			}
		}
	}

	//'j'
	public void centerShip() {
		IIterator anIterator = myGameObjects.getIterator();
		Object currentObj = new Object();
		while(anIterator.hasNext()) {
			currentObj = anIterator.next();
			if (currentObj instanceof PlayerShip) {
				PlayerShip ps = (PlayerShip)currentObj;
				ps.centerShip();
			
			}
		}
		
	}
	
	//'n'
	public void resupplyPS() { //resupply player ship missiesl to 10
		IIterator anIterator = myGameObjects.getIterator();
		Object currentObj = new Object();
		while(anIterator.hasNext()) {
			currentObj = anIterator.next();
			if (currentObj instanceof PlayerShip) {
				PlayerShip ps = (PlayerShip)currentObj;
				ps.setMissileCount();
			
			}
		}
		
	}
	
	//'k'
	public void killedAstroid() { //player ship has killed an asteroid, remove missile and astroid from array/world
		IIterator anIterator = myGameObjects.getIterator();
		Object currentObj = new Object();
		while(anIterator.hasNext()) {
			currentObj = anIterator.next();
			if (currentObj instanceof Astroid) {
				store.remove(currentObj);
			
				PlayerShip ps = new PlayerShip();
				playerScore++;
				ps.setMissile(ps.getMissiles() - 1);
			}
		}
		while(anIterator.hasNext()) {
			if (currentObj instanceof Missile) {
				store.remove(currentObj);
			
			}
		}
	}
	
	//'e'
	public void eliminatedNPS() { //player ship has killed an non player ship; remove missile and non player ship from array and world
		IIterator anIterator = myGameObjects.getIterator();
		Object currentObj = new Object();
		while(anIterator.hasNext()) {
			currentObj = anIterator.next();
			if (currentObj instanceof Missile) {
				store.remove(currentObj);
			
				
			}
		}
		
		while(anIterator.hasNext()) {
			currentObj = anIterator.next();
			if (currentObj instanceof NonPlayerShip) {
				store.remove(currentObj);
				
			}
		}
		PlayerShip ps = new PlayerShip(); //increase the players score
		playerScore++;
		ps.setMissile(ps.getMissiles() - 1);
		
	}
	
	//'E'
	public void explodedPS() {
		IIterator anIterator = myGameObjects.getIterator();
		Object currentObj = new Object();
		while(anIterator.hasNext()) {
			currentObj = anIterator.next();
			if (currentObj instanceof Missile) {
				store.remove(currentObj);	
			
			}
		}
		
		while(anIterator.hasNext()) {
			currentObj = anIterator.next();
			if (currentObj instanceof PlayerShip) {
				store.remove(currentObj);
			
			}
		}
	
		while(anIterator.hasNext()) {
			currentObj = anIterator.next();
			if (currentObj instanceof NonPlayerShip) {
				NonPlayerShip nps = new NonPlayerShip();
				nps.setMissile(nps.getMissiles() - 1);
			
			}
		}
		
		lives--;
		
		
	}
	
	//'c'
	public void crashedAstroid() {
		IIterator anIterator = myGameObjects.getIterator();
		Object currentObj = new Object();
		while(anIterator.hasNext()) {
			currentObj = anIterator.next();
		
			if (currentObj instanceof PlayerShip) {
				store.remove(currentObj);	
			
			}
		}
	
		while(anIterator.hasNext()) {
			currentObj = anIterator.next();
			if (currentObj instanceof Astroid) {
				store.remove(currentObj);
		
			}
		}
		lives --;
		if (lives == 0) {
			System.out.println("Game is over");
			System.exit(0);
		}
	}
	
	//'h'
	public void hitNPS() {
		IIterator anIterator = myGameObjects.getIterator();
		Object currentObj = new Object();
		while(anIterator.hasNext()) {
			currentObj = anIterator.next();
			if (currentObj instanceof NonPlayerShip) {
				store.remove(currentObj);	
	
			
			}
		}
		//decremetn lives
		lives --;
		if (lives == 0) {
			System.out.println("Game is over");
			System.exit(0);
		}
		
	}
	
	//'x'
	public void exterminatedAstroid() {
		IIterator anIterator = myGameObjects.getIterator();
		Object currentObj = new Object();
		while(anIterator.hasNext()) {
			currentObj = anIterator.next();
			if (currentObj instanceof Astroid) {
				store.remove(currentObj);	
		
			
			}
		}
		
		while(anIterator.hasNext()) {
			currentObj = anIterator.next();
		
			if (currentObj instanceof Astroid) {
				store.remove(currentObj);	
	
			}
		}
		
	}
	
	//'I'
	public void impactedNPS() {
		IIterator anIterator = myGameObjects.getIterator();
		Object currentObj = new Object();
		while(anIterator.hasNext()) {
			currentObj = anIterator.next();
		
			if (currentObj instanceof NonPlayerShip) {
				store.remove(currentObj);	
			
			
			}
		}
		
		while(anIterator.hasNext()) {
			currentObj = anIterator.next();
		
			if (currentObj instanceof Astroid) {
				store.remove(currentObj);
			
			}
		}
		
	}
	
	//'t'
	public void gameClock() {
		IIterator anIterator = myGameObjects.getIterator();
		Object currentObj = new Object();
		while(anIterator.hasNext()) {
			currentObj = anIterator.next();

			if (currentObj instanceof MoveableGameObject) {
				MoveableGameObject mObj = (MoveableGameObject)currentObj;
				mObj.move();
				
			
			}
		}
		
		while(anIterator.hasNext()) {
			currentObj = anIterator.next();
		
			if (currentObj instanceof Missile) {
				Missile missile = (Missile)currentObj;
				if (missile.getFuel() == 10) {
					store.remove(missile);
					this.setChanged();
					this.notifyObservers(new GameWorldProxy(this));
				
				}
				else {
					missile.setFuelLevel(missile.getFuel() - 1);
					
					
						
				}
			}
		}
		
		while(anIterator.hasNext()) {
			currentObj = anIterator.next();
		
			if (currentObj instanceof SpaceStation) {
				SpaceStation station = (SpaceStation)currentObj;
				if (gameTime % station.getBlinkRate() == 0) {
					station.toggleBlinkLight();
				}
			}
		}
		
		gameTime++;
		
		
	}
	
	//'p'
	public void printGameStatus() {
		IIterator anIterator = myGameObjects.getIterator();
		Object currentObj = new Object();
		while(anIterator.hasNext()) {
			currentObj = anIterator.next();
		
			if (currentObj instanceof PlayerShip) {
				PlayerShip ps = (PlayerShip)currentObj;
				//int score = ps.getScore();
				System.out.println("Player score is " + playerScore);
				int missiles = ps.getMissiles();
				System.out.println("Number of missiles in ship: " + missiles);
				System.out.println("Current Elapsed Time: " + gameTime);
			}
		}
		
		
		
	}
	
	//'m'
	public void printWorldStatus() {
		//ArrayList<gameObjects> = GameObject.getObjects();
		IIterator anIterator = myGameObjects.getIterator();
		Object currentObj = new Object();
		while(anIterator.hasNext()) {
			currentObj = anIterator.next();
		
			if (currentObj instanceof Astroid) {
				Astroid astroid = (Astroid)currentObj;
				String string = astroid.toString();
				System.out.println(string);
			}
						
			else if (currentObj instanceof PlayerShip) {
				PlayerShip ps = (PlayerShip)currentObj;
				String string = ps.toString();
				System.out.println(string);
			}
			else if (currentObj instanceof Missile) {
				Missile missile = (Missile)currentObj;
				String string = missile.toString();
				System.out.println(string);
			}
			else if (currentObj instanceof NonPlayerShip) {
				NonPlayerShip nps = (NonPlayerShip)currentObj;
				String string = nps.toString();
				System.out.println(string);
			}
			else if (currentObj instanceof SpaceStation) {
				SpaceStation station = (SpaceStation)currentObj;
				String string = station.toString();
				System.out.println(string);
			}	
					
		}	
	}
	
	//'q'
	public void quit() {
		
		System.exit(0);
		
	}
	
	
	
	@Override
	public void addObserver(IObserver o) {
		// TODO Auto-generated method stub
		store.add((GameObject)o);
		
	}
	
	@Override
	public void notifyObservers() {
		
		int i; // counter for going through observers
		Object theObservers[]; // array of observables watching me
		
		theObservers = store.toArray();
		
		// go through all observers and pass them a copy of myself
		if(!store.isEmpty()){
			for(i = 0; i < store.size(); i++)
				((IObserver)theObservers[i]).update(this);
		}
		
	}
	
	public void toggleSound() {
		if(sound) {
			sound = false;
			
		}
		else {
			sound = true;
			
		}
		//notifyObservers(PointsView);
		
		
	}
	

	//@Override
	public int getPlayerScore() {
		// TODO Auto-generated method stub
		return playerScore;
	}

	public boolean soundIsOn() {
		// TODO Auto-generated method stub
		return sound;
	}
	
	public int getLives() {
		return lives;
	}
	
	public int getClockTime(){
		return gameTime;
	}
	
	//int getMissileCount() {
	//	return p
	//}

}
	
	
	
	
	
	
	
