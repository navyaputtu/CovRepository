package com.covalense.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.covalense.beans.Employee;
import com.covalense.service.EmployeeService;

public class App_01 {

	public static void main(String[] args) {
		ApplicationContext ctxt=new ClassPathXmlApplicationContext("spring.xml");
		EmployeeService employeeService=(EmployeeService)ctxt.getBean("employeeService");
		Employee employee=new Employee(101,"navya puttu",20);
		employeeService.save(employee);

	}

}
