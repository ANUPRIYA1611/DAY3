package com.example.demo.Service;


import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Models.Employee;
import com.example.demo.Repository.EmployeeRepo;
import java.util.Optional;
import org.springframework.stereotype.Service;



@Service
public class ApiService {
	@Autowired
	EmployeeRepo repository;
    
	public Optional<Employee> getemployee(int id){
		return repository.findById(id);
	}
	
}
