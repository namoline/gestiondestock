package com.nnemou.gestiondestock.dto;

import java.math.BigDecimal;


import com.nnemou.gestiondestock.model.LigneCommandeFournisseur;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class LigneCommandeFournisseurDto {
	private Integer id;
	private ArticleDto article;
	
	private CommandeFournisseurDto commandeFournisseur;
	

	private BigDecimal quantite;
	
	private BigDecimal prixUnitaire;
	
	private Integer idEntreprise;
	
	public static LigneCommandeFournisseurDto fromEntity(LigneCommandeFournisseur ligneCommandeFournisseur) {
	    if (ligneCommandeFournisseur == null) {
	      return null;
	    }
	    return LigneCommandeFournisseurDto.builder()
	        .id(ligneCommandeFournisseur.getId())
	        .article(ArticleDto.fromEntity(ligneCommandeFournisseur.getArticle()))
	        .quantite(ligneCommandeFournisseur.getQuantite())
	        .prixUnitaire(ligneCommandeFournisseur.getPrixUnitaire())
	        .idEntreprise(ligneCommandeFournisseur.getIdEntreprise())
	        .build();
	  }
	
	
	public static LigneCommandeFournisseur toEntity(LigneCommandeFournisseurDto ligneCommandeFournisseurDto) {
	    if (ligneCommandeFournisseurDto == null) {
	      return null;
	    }
	    return LigneCommandeFournisseur.builder()
	        .id(ligneCommandeFournisseurDto.getId())
	        .article(ArticleDto.toEntity(ligneCommandeFournisseurDto.getArticle()))
	        .quantite(ligneCommandeFournisseurDto.getQuantite())
	        .prixUnitaire(ligneCommandeFournisseurDto.getPrixUnitaire())
	        .idEntreprise(ligneCommandeFournisseurDto.getIdEntreprise())
	        .build();
	  }
}
