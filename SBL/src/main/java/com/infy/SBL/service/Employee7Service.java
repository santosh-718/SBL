package com.infy.SBL.service;

import java.util.List;

import com.infy.SBL.entity.Employee7;

public interface Employee7Service {
	
	  public Employee7 saveEmployee(Employee7 employee7);
	  public Employee7 updateEmployee(Employee7 employee7);
	  public void deleteEmployee(Employee7 employee7);
	  public List<Employee7> findAll();

}
