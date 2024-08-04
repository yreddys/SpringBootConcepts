package in.yarraneella.model;

import in.yarraneella.entity.Department;
import in.yarraneella.entity.Student;
import lombok.Data;

@Data
public class DepartmentStudentRequest {
	private Department department;
	private Student student;
}
