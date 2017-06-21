package com.restservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.restservice.model.Employee;
import com.restservice.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService empService;
	
	@RequestMapping(value="/employee", method = RequestMethod.POST, consumes = MediaType.ALL_VALUE)
	void addEmployee(@RequestBody Employee emp){
	System.out.println("Controller: Add Employee...");
	empService.addEmployee(emp);
	}
	
	@RequestMapping(value="/employee", method = RequestMethod.GET, consumes = MediaType.ALL_VALUE)
	void getAllEmployees(){
	System.out.println("Controller: Add Employee...");
	empService.getAllEmployees();
	}
	
}
