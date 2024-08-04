package in.yarraneella.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.yarraneella.entity.Department;
@Repository
public interface DepartmentRepository extends JpaRepository<Department,Integer>{

}
