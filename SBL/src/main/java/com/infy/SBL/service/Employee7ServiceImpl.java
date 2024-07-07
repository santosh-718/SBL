package com.infy.SBL.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.SBL.entity.Employee7;
import com.infy.SBL.repository.Employee7Repository;

@Service
public class Employee7ServiceImpl implements Employee7Service {

	@Autowired
	private Employee7Repository employee7Repository;
	@Override
	public Employee7 saveEmployee(Employee7 employee7) {
		// TODO Auto-generated method stub
		return employee7Repository.save(employee7);
	}

	@Override
	public Employee7 updateEmployee(Employee7 employee7) {
		// TODO Auto-generated method stub
		return employee7Repository.save(employee7);
	}

	@Override
	public void deleteEmployee(Employee7 employee7) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Employee7> findAll() {
		// TODO Auto-generated method stub
		return employee7Repository.findAll();
	}

}
