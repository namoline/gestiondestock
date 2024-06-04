package com.nnemou.gestiondestock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nnemou.gestiondestock.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

	
	Category findByCode(String code);
}
