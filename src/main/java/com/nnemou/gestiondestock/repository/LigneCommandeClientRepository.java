package com.nnemou.gestiondestock.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.nnemou.gestiondestock.model.LigneCommandeClient;

public interface LigneCommandeClientRepository extends JpaRepository<LigneCommandeClient, Integer>  {

	  List<LigneCommandeClient> findAllByCommandeClientId(Integer id);

	  List<LigneCommandeClient> findAllByArticleId(Integer id);

}
