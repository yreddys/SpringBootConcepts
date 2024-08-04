package com.crud.service;

import java.util.List;

import com.crud.entity.Employee;

public interface EmployeeService {

	Employee save(Employee emp);

	List<Employee> getAllEmployees();

	Employee getEmployeeById(int empId);

	Employee updateEmployee(int empId, Employee updatedEmployee);

	boolean deleteEmployee(int empId);

}
