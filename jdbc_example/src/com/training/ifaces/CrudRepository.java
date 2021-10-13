package com.training.ifaces;
import java.awt.print.Book;
import java.util.*;

import com.training.entity.Student;


public interface CrudRepository<T,e> {
	public boolean add(T t);//create
	public List<Student> findAll();//read
	public boolean update(T t);//update
	public boolean remove(T t);//delete => CRUD
	public Student findById(int e);

}
