package in.yarraneella.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.yarraneella.entity.Department;
import in.yarraneella.entity.Student;
import in.yarraneella.model.DepartmentStudentRequest;
import in.yarraneella.model.DepartmentStudentResponse;
import in.yarraneella.repository.DepartmentRepository;
import in.yarraneella.repository.StudentRepository;
import jakarta.transaction.Transactional;

@Service
public class DepartmentStudentImpl implements DepartmentStudentService {
	@Autowired
	private DepartmentRepository departmentRepository;
	@Autowired
	private StudentRepository studentRepository;

	@Override
	@Transactional
	public DepartmentStudentResponse createDepartmentStudent(DepartmentStudentRequest dSRequest) {
		Department department = new Department();
		department.setDepartmentName(dSRequest.getDepartment().getDepartmentName());
		department = departmentRepository.save(department);
		Student student = dSRequest.getStudent();
		if (student.getName().startsWith("S")) {
			throw new IllegalArgumentException("Student name should not start with 'S'");
		}
		student = studentRepository.save(student);
		DepartmentStudentResponse dsresponse = new DepartmentStudentResponse();
		dsresponse.setDepartmentId(department.getDepartmentId());
		dsresponse.setDepartmentName(department.getDepartmentName());
		dsresponse.setStudentId(student.getStudentId());
		dsresponse.setName(student.getName());
		return dsresponse;
	}
}
