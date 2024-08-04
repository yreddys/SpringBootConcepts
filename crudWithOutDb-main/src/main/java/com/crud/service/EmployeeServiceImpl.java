package com.crud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.crud.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	private final List<Employee> employees = new ArrayList<>();
	private int idCounter = 1;

	@Override
	public Employee save(Employee emp) {
		emp.setEmpId(idCounter++);
		employees.add(emp);
		return emp;
	}

	@Override
	public List<Employee> getAllEmployees() {

		return new ArrayList<>(employees);
	}

	@Override
	public Employee getEmployeeById(int empId) {
		for (Employee employee : employees) {
			if (employee.getEmpId() == empId) {
				return employee;
			}
		}
		return null;
	}

	@Override
	public Employee updateEmployee(int empId, Employee updatedEmployee) {
		for (Employee employee : employees) {
			if (employee.getEmpId() == empId) {
				employee.setEmpName(updatedEmployee.getEmpName());
				return employee;
			}
		}
		return null;
	}

	@Override
	public boolean deleteEmployee(int empId) {
		for (Employee employee : employees) {
			if (employee.getEmpId() == empId) {
				employees.remove(employee);
				return true;
			}
		}
		return false;
	}

}
