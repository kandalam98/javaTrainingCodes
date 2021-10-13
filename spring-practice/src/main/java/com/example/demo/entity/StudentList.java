package com.example.demo.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Component
@AllArgsConstructor
@Setter
@Getter
@ToString
@Lazy
@Scope("prototype")
// by default whatever the class name, its starting letter is small is BIN name
//StudentList is class name ,  studentList is BIN name.
public class StudentList {
	
	
	public StudentList() {
		super();
		System.out.println("==== Student Service Called====");
	}

	@Autowired
	private List<Student> invList;
	

}
