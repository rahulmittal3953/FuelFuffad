package com.restservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restservice.model.Employee;

public interface EmployeeDAO extends JpaRepository<Employee, Long>{

}
