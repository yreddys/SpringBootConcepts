package in.yarraneella.model;

import in.yarraneella.entity.Department;
import in.yarraneella.entity.Student;
import lombok.Data;
@Data
public class DepartmentStudentResponse {
	private int studentId;
	private String name;
	private int departmentId;
	private String departmentName;
}
