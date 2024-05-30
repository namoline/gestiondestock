package com.nnemou.gestiondestock.dto;

import java.math.BigDecimal;

import com.nnemou.gestiondestock.model.LigneCommandeClient;

import lombok.Builder;
import lombok.Data;


@Builder
@Data
public class LigneCommandeClientDto {
	private Integer id;
	private ArticleDto article;
	
	CommandeClientDto commandeClient;
	
	private BigDecimal quantite;
	
	private BigDecimal prixUnitaire;
	
	private Integer idEntreprise;
	
	public static LigneCommandeClientDto fromEntity(LigneCommandeClient ligneCommandeClient) {
	    if (ligneCommandeClient == null) {
	      return null;
	    }
	    return LigneCommandeClientDto.builder()
	        .id(ligneCommandeClient.getId())
	        .article(ArticleDto.fromEntity(ligneCommandeClient.getArticle()))
	        .quantite(ligneCommandeClient.getQuantite())
	        .prixUnitaire(ligneCommandeClient.getPrixUnitaire())
	        .idEntreprise(ligneCommandeClient.getIdEntreprise())
	        .build();
	  }
	
	
	
	public static LigneCommandeClient fromEntity(LigneCommandeClientDto ligneCommandeClientDto) {
	    if (ligneCommandeClientDto == null) {
	      return null;
	    }
	    return LigneCommandeClient.builder()
	        .id(ligneCommandeClientDto.getId())
	        .article(ArticleDto.toEntity(ligneCommandeClientDto.getArticle()))
	        .quantite(ligneCommandeClientDto.getQuantite())
	        .prixUnitaire(ligneCommandeClientDto.getPrixUnitaire())
	        .idEntreprise(ligneCommandeClientDto.getIdEntreprise())
	        .build();
	  }
}
