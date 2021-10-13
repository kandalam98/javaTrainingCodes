package com.example.demo.exceptions;

import java.time.LocalDateTime;

import com.example.demo.exceptions.ErrorHandler;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorHandler {

	private LocalDateTime currentTime;
	private String message;
	private String description;
}
