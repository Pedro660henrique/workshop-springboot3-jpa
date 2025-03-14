package com.projetotest.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetotest.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
		
}
