package com.mycompany.a2;


public interface ICollection {
	//add object to collection
	public void add(GameObject gw);
	
	//get iterator to iterate through collection
	public IIterator getIterator();
	
	//remove object when invoked
	public boolean remove(Object o);
}
