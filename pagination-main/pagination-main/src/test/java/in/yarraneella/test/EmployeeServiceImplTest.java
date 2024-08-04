package in.yarraneella.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import in.yarraneella.entity.Employee;
import in.yarraneella.repository.EmployeeRepository;
import in.yarraneella.service.EmployeeServiceImpl;

@ExtendWith(MockitoExtension.class)
class EmployeeServiceImplTest {

	@Mock
	private EmployeeRepository employeeRepository;

	@InjectMocks
	private EmployeeServiceImpl employeeService;

	@Test
	void testGetAllEmployees() {
		// Mocking employee data
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1, "reddy", 23));
		employees.add(new Employee(2, "HR", 33));

		// Mocking repository method to return employee data
		Page<Employee> page = new PageImpl<>(employees);
		when(employeeRepository.findAll(any(PageRequest.class))).thenReturn(page);

		// Call the service method
		Page<Employee> result = employeeService.getAllEmployees(0, 10);

		// Verify that the repository method was called once with the correct arguments
		verify(employeeRepository, times(1)).findAll(PageRequest.of(0, 10));

		// Verify that the result matches the mocked data
		assertEquals(employees.size(), result.getContent().size());
		assertEquals(employees.get(0).getName(), result.getContent().get(0).getName());

	}
}
