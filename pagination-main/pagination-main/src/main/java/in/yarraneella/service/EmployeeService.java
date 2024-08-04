package in.yarraneella.service;

import in.yarraneella.entity.Employee;

public interface EmployeeService {

	org.springframework.data.domain.Page<Employee> getAllEmployees(int page, int size);

}
