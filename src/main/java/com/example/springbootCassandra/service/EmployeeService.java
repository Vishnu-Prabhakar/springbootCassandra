package com.example.springbootCassandra.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootCassandra.model.Employee;
import com.example.springbootCassandra.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public List<Employee> getEmployeeList(){
		return employeeRepository.findAll();
	}

}
