package com.casestudy.demo.repo;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import com.casestudy.demo.Employee;



public interface EmployeeCrud<T,E> {
	public boolean add(T t);//create
	public List<Employee> findAll();//read
	public boolean update(T t);//update
	public boolean remove(T t);//delete => CRUD
	public Employee findByname(String e);
	List<Employee> findByBirthday(LocalDate e);
	Map<String,String> findByAnniversary(LocalDate e);
	Map<String,String>  findAllNameandNumber();


}
