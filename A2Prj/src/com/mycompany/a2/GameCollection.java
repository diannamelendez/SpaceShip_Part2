package com.mycompany.a2;

import java.util.ArrayList;
import java.util.Vector;



public class GameCollection implements ICollection{

	// dynamically sized array of objects
		
	
		private ArrayList<GameObject> gameObjects;
		
		
		
		// construct a collection
		
		
		public GameCollection() {
			gameObjects = new ArrayList();
		}
		
		// add an object to the collection
		
		public void add(GameObject newObj) {
			gameObjects.add(newObj);
			//return true;
		}

		// get an iterator to move through the collection
		public IIterator getIterator(){
			return new GameObjectIterator();
		}
		
		// remove the given object from the collection
		public boolean remove(GameObject o) {
			return gameObjects.remove(o);
		}

		// returned Iterator Class 
		private class GameObjectIterator implements IIterator {
			
			// index for
			private int currObjIndex;
			
			// construct an iterator, and initialize index to -1
			public GameObjectIterator(){
				currObjIndex = -1;
			}
			
			// are there more objects in the collection?
			public boolean hasNext(){
				
				// are there any at all?
				if(gameObjects.size() < 1)
					return false;
				
				// are there any after the last one we returned?
				if(currObjIndex == gameObjects.size() - 1 )
					return false;
				
				// there's more, so true
				return true;
			}

			// return the next object in the collection
			public Object next() {
				currObjIndex++;
				return(gameObjects.get(currObjIndex));
			}
		}

		public Object[] toArray() {
			// TODO Auto-generated method stub
			return null;
		}

		public boolean isEmpty() {
			// TODO Auto-generated method stub
			return false;
		}

		public int size() {
			// TODO Auto-generated method stub
			return 0;
		}

		

		@Override
		public boolean remove(Object o) {
			// TODO Auto-generated method stub
			return false;
		}
	

}
