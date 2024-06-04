package com.nnemou.gestiondestock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nnemou.gestiondestock.model.Roles;

public interface RolesRepository extends JpaRepository<Roles, Integer> {

	Roles findByUtilisateurId(Integer id);
}
