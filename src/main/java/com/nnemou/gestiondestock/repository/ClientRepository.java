package com.nnemou.gestiondestock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nnemou.gestiondestock.model.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {

	Client findByNomAndPrenom(String nom, String prenom);
}
