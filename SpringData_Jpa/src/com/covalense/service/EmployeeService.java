package com.covalense.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.covalense.beans.Employee;
import com.covalense.repository.EmployeeRepo;

@Component("employeeService")

public class EmployeeService {
	@Autowired
	EmployeeRepo employeeRepo;

	public void save(Employee employee) {
		((EmployeeService) employeeRepo).save(employee);
	}

	public Employee find(int id) {
		return ((CrudRepository<Employee, Integer>) employeeRepo).findById(id).get();
	}

	public List<Employee> findAll() {
		return (List<Employee>) ((EmployeeService) employeeRepo).findAll();
	}
}