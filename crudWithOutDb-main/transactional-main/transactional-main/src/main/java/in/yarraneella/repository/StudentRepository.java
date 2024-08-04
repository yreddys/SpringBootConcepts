package in.yarraneella.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.yarraneella.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{

}
