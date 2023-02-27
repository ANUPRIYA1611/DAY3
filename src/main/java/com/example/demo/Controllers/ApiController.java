package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Models.Employee;
import com.example.demo.Repository.EmployeeRepo;
import com.example.demo.Service.ApiService;


public class ApiController {
@Autowired
EmployeeRepo serviceRepository;
@Autowired
ApiService service;
@GetMapping("/getvalues")
List<Employee>getList()
{
	return serviceRepository.findAll();
}
@PostMapping("/post")
public Employee create(@RequestBody Employee em)
{
	return serviceRepository.save(em);
}
}
