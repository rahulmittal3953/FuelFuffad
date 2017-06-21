package com.restservice.service;

import java.util.List;

import com.restservice.model.Employee;

public interface EmployeeService {
	void addEmployee(Employee emp);

	void updateEmployee(Employee emo);

	List<Employee> getAllEmployees();

	Employee getEmployee(long id);

	void deleteEmployee(long id);

	void deleteAllEmployees();

}
