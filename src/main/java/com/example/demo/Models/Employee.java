package com.example.demo.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	private int id;
	private String EmloyeeString;
	private int employeeInt;
	private long salary;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	public Employee(int id, String emloyeeString, int employeeInt, long salary) {
		super();
		this.id = id;
		EmloyeeString = emloyeeString;
		this.employeeInt = employeeInt;
		this.salary = salary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmloyeeString() {
		return EmloyeeString;
	}
	public void setEmloyeeString(String emloyeeString) {
		EmloyeeString = emloyeeString;
	}
	public int getEmployeeInt() {
		return employeeInt;
	}
	public void setEmployeeInt(int employeeInt) {
		this.employeeInt = employeeInt;
	}
	
	public long getSalary() {
		return salary;
	}
	
	public void setSalary(long salary) {
		this.salary = salary;
	}
	

}
