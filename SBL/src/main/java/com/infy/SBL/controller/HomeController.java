package com.infy.SBL.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infy.SBL.entity.Employee7;
import com.infy.SBL.service.Employee7Service;

@RestController
public class HomeController {
    
	@Autowired
	Employee7Service employee7Service;
	@GetMapping("/employee7/")
	public List<Employee7> saveStudent() {
		
		List<Employee7> emploeeList = employee7Service.findAll();
		
		
		return emploeeList;
	}
	
	@PostMapping("/employee7/")
	public Employee7 saveEmployee(@RequestBody Employee7 employee7) {
		
		Employee7 saveEmployee = employee7Service.saveEmployee(employee7);
		return saveEmployee;
		
	}
}
