package in.yarraneella.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import in.yarraneella.entity.Employee;
import in.yarraneella.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public org.springframework.data.domain.Page<Employee> getAllEmployees(int page, int size) {
		PageRequest pageable = PageRequest.of(page, size);
		return employeeRepository.findAll(pageable);
	}

}
