package com.employee.userdb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.userdb.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
