package com.example.demo.dto;

import java.time.LocalDate;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level=AccessLevel.PRIVATE)
@Component
public class Student {

	int rollNumber;
	@Length(min=3 ,max=20,message ="Name should be 3 to 20 characters")
	String studentName;
	@DateTimeFormat(iso=ISO.DATE)
	LocalDate dateOfBirth;
	double markScored;
}
