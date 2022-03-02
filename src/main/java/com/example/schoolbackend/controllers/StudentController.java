package com.example.schoolbackend.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@GetMapping("/getname")
	public ResponseEntity<Object> getName() {
		
		List<String> myData = new ArrayList<>();
		myData.add("Tonykay");
		myData.add("Sammy");
		
		return ResponseEntity.status(HttpStatus.OK).body(myData);
	}
}
