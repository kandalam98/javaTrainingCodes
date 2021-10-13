package com.training.ifaces;

public interface DataAccess {

	boolean add(Object obj);
	Object[] findAll();
	Object findById(int id);
	public int update(Object obj);
	public int remove(Object obj);	
}
