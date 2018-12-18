package com.example.springbootCassandra.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootCassandra.model.Employee;
import com.example.springbootCassandra.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping("/getEmployeeList")
	public List<Employee> getEmployeeList(){
		return employeeService.getEmployeeList();
	}

}
