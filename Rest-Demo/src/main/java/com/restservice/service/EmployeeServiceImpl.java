package com.restservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restservice.dao.EmployeeDAO;
import com.restservice.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDAO empDAO;
	
	@Override
	public void addEmployee(Employee emp) {
		System.out.println("Add Employee DAO");
		empDAO.save(emp);
	}

	@Override
	public void updateEmployee(Employee emp) {
		empDAO.save(emp);

	}

	@Override
	public List<Employee> getAllEmployees() {
		return  empDAO.findAll();
		
	}

	@Override
	public Employee getEmployee(long id) {
		return empDAO.findOne(id);
	}

	@Override
	public void deleteEmployee(long id) {
		empDAO.delete(id);

	}

	@Override
	public void deleteAllEmployees() {
		empDAO.deleteAll();
	}
}