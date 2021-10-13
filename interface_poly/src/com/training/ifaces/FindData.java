package com.training.ifaces;

public interface FindData extends ManageData {

	Object[] findAll();
	Object findById(int id);
}
