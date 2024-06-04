package com.nnemou.gestiondestock.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.nnemou.gestiondestock.model.LigneCommandeFournisseur;

public interface LigneCommandeFournisseurRepository extends JpaRepository<LigneCommandeFournisseur, Integer> {
	List<LigneCommandeFournisseur> findAllByCommandeFournisseurId(Integer idCommande);

	List<LigneCommandeFournisseur> findAllByArticleId(Integer idCommande);

}
