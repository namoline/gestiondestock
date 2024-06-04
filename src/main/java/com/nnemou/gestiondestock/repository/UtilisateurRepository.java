package com.nnemou.gestiondestock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nnemou.gestiondestock.model.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {
	@Query(value = "select u from Utilisateur u where u.email = :email")
	 Utilisateur findUtilisateurByEmail(@Param("email") String email);

}
