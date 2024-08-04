package in.yarraneella;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import in.yarraneella.entity.Department;
import in.yarraneella.entity.Student;
import in.yarraneella.model.DepartmentStudentRequest;
import in.yarraneella.model.DepartmentStudentResponse;
import in.yarraneella.repository.DepartmentRepository;
import in.yarraneella.repository.StudentRepository;
import in.yarraneella.service.DepartmentStudentImpl;

@ExtendWith(MockitoExtension.class)
public class DepartmentStudentImplTest {

    @Mock
    private DepartmentRepository departmentRepository;

    @Mock
    private StudentRepository studentRepository;

    @InjectMocks
    private DepartmentStudentImpl departmentStudentService;

    private DepartmentStudentRequest request;

    @BeforeEach
    void setUp() {
        request = new DepartmentStudentRequest();
        Department department = new Department();
        department.setDepartmentName("Test Department");
        request.setDepartment(department);

        Student student = new Student();
        student.setName("Valid Student");
        request.setStudent(student);
    }

    @Test
    public void testCreateDepartmentStudent_ValidData_Success() {
        // Arrange
        when(departmentRepository.save(any(Department.class))).thenReturn(new Department());
        when(studentRepository.save(any(Student.class))).thenReturn(new Student());

        // Act
        DepartmentStudentResponse response = departmentStudentService.createDepartmentStudent(request);

   
    }

    @Test
    public void testCreateDepartmentStudent_InvalidStudentName_ExceptionThrown() {
        // Arrange
        request.getStudent().setName("StudentWithInvalidName");

       
        assertThrows(IllegalArgumentException.class, () -> {
            departmentStudentService.createDepartmentStudent(request);
        });
    }
}
