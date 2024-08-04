package in.yarraneella.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.yarraneella.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{

	User findById(Long id);

}
