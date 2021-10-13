package com.training.entity;

import com.training.Column;
import com.training.stereotypes.Table;

@Table(tableName="vidyarthi")
public class StudentAnnotation {
	@Column(name="rollnumber")
	private int id;
	
	@Column(name="firstName")
	private String name;
	
	public StudentAnnotation() {
		super();
	}

}
