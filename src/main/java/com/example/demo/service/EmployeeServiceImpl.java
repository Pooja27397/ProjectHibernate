package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dao.EmployeeRepo;
import com.example.demo.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepo employeeRepository;
	@Override
	public Employee saveEmployee(Employee employee) {
	return employeeRepository.save(employee); 

}
	}
	