package in.yarraneella.service;

import in.yarraneella.model.DepartmentStudentRequest;
import in.yarraneella.model.DepartmentStudentResponse;

public interface DepartmentStudentService {

	DepartmentStudentResponse createDepartmentStudent(DepartmentStudentRequest dSRequest);

}
