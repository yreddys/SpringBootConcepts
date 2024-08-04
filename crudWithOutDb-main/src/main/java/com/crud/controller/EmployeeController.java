package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.entity.Employee;
import com.crud.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeSerive;

	@PostMapping
	public Employee createItem(@RequestBody Employee emp) {
		return employeeSerive.save(emp);
	}

	@GetMapping
	public List<Employee> getAllEmployees() {
		return employeeSerive.getAllEmployees();
	}

	@GetMapping("/{empId}")
	public Employee getEmployeeById(@PathVariable int empId) {
		return employeeSerive.getEmployeeById(empId);
	}

	@PutMapping("/{empId}")
	public Employee updateEmployee(@PathVariable int empId, @RequestBody Employee updatedEmployee) {
		return employeeSerive.updateEmployee(empId, updatedEmployee);
	}

	@DeleteMapping("/{empId}")
	public boolean deleteEmployee(@PathVariable int empId) {
		return employeeSerive.deleteEmployee(empId);
	}

}
