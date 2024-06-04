package com.nnemou.gestiondestock.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.nnemou.gestiondestock.model.Fournisseur;

public interface FournisseurRepository extends JpaRepository<Fournisseur, Integer> {

	Fournisseur findByNomAndPrenom(String nom, String prenom);
}
