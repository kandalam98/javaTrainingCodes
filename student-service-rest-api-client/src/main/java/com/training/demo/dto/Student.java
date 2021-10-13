package com.training.demo.dto;

import java.time.LocalDate;


import lombok.Data;

@Data

public class Student {

	int rollnumber;
	String studentname;
	LocalDate dateofbirth;
	double markscored;
}
