package com.projetotest.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetotest.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
		
}
