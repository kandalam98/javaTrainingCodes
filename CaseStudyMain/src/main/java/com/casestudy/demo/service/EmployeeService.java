package com.casestudy.demo.service;

import java.time.LocalDate;




import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.casestudy.demo.Employee;


public class EmployeeService {
	@Override
	public String toString() {
		return "EmployeeService [employeeList=" + employeeList + "]";
	}
	private List<Employee> employeeList;
	public EmployeeService() {
		super();
		this.employeeList=new ArrayList<>();
	}

	public List<String> findByBirthdayService(List<Employee> list)
	{
		return list.stream()
                .map(emp -> (emp.getFirstName()+"  "+emp.getEmail()))
                    .collect(Collectors.toList());
	}
	public Map<String,Integer> getSameAnniversaryNames(LocalDate date2){
		return this.employeeList.stream().filter(e -> e.getAnniversary()==date2).collect(Collectors.toMap(Employee::getFirstName,Employee::getPhoneNumber));
	}
	public Map<String,Integer> getAllNames(){
		return this.employeeList.stream().collect(Collectors.toMap(Employee::getFirstName,Employee::getPhoneNumber));
	}
	public List<String> getInfoByName(String firstName)
	{
		return this.employeeList.stream().collect(Collectors.mapping(Employee::getFirstName, Collectors.toList()));
	}


}
