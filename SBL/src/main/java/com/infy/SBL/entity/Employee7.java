package com.infy.SBL.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="EMPLOYEE7")
public class Employee7 {
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="DESIGNATION")
	private String designation;
	
	@Column(name="SALARY")
	private long salary;
	
	@Id
	@Column(name="EMP_ID")
	private long empId;

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

}
