package com.nnemou.gestiondestock.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.nnemou.gestiondestock.model.Ventes;

public interface VentesRepository extends JpaRepository<Ventes, Integer> {
	 Ventes findVentesByCode(String code);
}
