package com.nnemou.gestiondestock.dto;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class LigneCommandeFournisseurDto {

	private ArticleDto article;
	
	private CommandeFournisseurDto commandeFournisseur;
	

	private BigDecimal quantite;
	
	private BigDecimal prixUnitaire;
	
	  private Integer idEntreprise;
}
