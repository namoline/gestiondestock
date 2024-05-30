package com.nnemou.gestiondestock.dto;

import java.math.BigDecimal;

import com.nnemou.gestiondestock.model.LigneVente;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class LigneVenteDto {

	private Integer id;
	
	private VentesDto vente;
	
	private BigDecimal quantite;
	
//@nan: voir si c'est bon
	private ArticleDto article;
	
	private BigDecimal prixUnitaire;
	
	private Integer idEntreprise;
	
	
	public static LigneVenteDto fromEntity(LigneVente ligneVente) {
	    if (ligneVente == null) {
	      return null;
	    }

	    return LigneVenteDto.builder()
	        .id(ligneVente.getId())
	        .vente(VentesDto.fromEntity(ligneVente.getVente()))
	        .article(ArticleDto.fromEntity(ligneVente.getArticle()))
	        .quantite(ligneVente.getQuantite())
	        .prixUnitaire(ligneVente.getPrixUnitaire())
	        .idEntreprise(ligneVente.getIdEntreprise())
	        .build();
	  }
	
	
	
	public static LigneVente toEntity(LigneVenteDto ligneVenteDto) {
	    if (ligneVenteDto == null) {
	      return null;
	    }

	    return LigneVente.builder()
	        .id(ligneVenteDto.getId())
	        .vente(VentesDto.toEntity(ligneVenteDto.getVente()))
	        .article(ArticleDto.toEntity(ligneVenteDto.getArticle()))
	        .quantite(ligneVenteDto.getQuantite())
	        .prixUnitaire(ligneVenteDto.getPrixUnitaire())
	        .idEntreprise(ligneVenteDto.getIdEntreprise())
	        .build();
	  }
}
