package com.example.demo.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level=AccessLevel.PRIVATE)
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	int productid;
	String productName;
	long ratePerUnit;

}
