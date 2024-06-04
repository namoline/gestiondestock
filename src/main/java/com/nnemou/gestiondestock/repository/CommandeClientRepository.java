package com.nnemou.gestiondestock.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nnemou.gestiondestock.model.CommandeClient;

public interface CommandeClientRepository extends JpaRepository<CommandeClient, Integer> {
	  CommandeClient findByCode(String code);

	  List<CommandeClient> findAllByClientId(Integer id);
}
