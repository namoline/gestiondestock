package com.nnemou.gestiondestock.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.nnemou.gestiondestock.model.Entreprise;

public interface EntrepriseRepository extends JpaRepository<Entreprise, Integer> {

	Entreprise findByCodeFiscal(String codeFisal);
}
