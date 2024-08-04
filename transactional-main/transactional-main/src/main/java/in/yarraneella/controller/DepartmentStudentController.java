package in.yarraneella.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.yarraneella.model.DepartmentStudentRequest;
import in.yarraneella.model.DepartmentStudentResponse;
import in.yarraneella.service.DepartmentStudentService;

@RestController
public class DepartmentStudentController {
	@Autowired
	private DepartmentStudentService departmentStudentService;

	@PostMapping("/save")
	ResponseEntity<DepartmentStudentResponse> createDepartmentStudent(@RequestBody DepartmentStudentRequest DSRequest) {
		DepartmentStudentResponse DSResponse = departmentStudentService.createDepartmentStudent(DSRequest);
		return new ResponseEntity<>(DSResponse, HttpStatus.CREATED);
	}
}