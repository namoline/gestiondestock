package com.nnemou.gestiondestock.dto;

import java.math.BigDecimal;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ArticleDto {
	
	private String codeArticle;
	
	
	private String designation;
	
	
	private BigDecimal prixUnitaireHt;
	
	
	private BigDecimal tauxTva;
	
	
	private BigDecimal prixUnitaireTtc;
	
	
	private Integer idEntreprise;
	
	/*photo non stockee en base de données */
	private String photo;
	
	
	private CategoryDto category;
	
	/* 
	private List<LigneVenteDto> lstLigneVentes;

	  
	private List<LigneCommandeClientDto> lstligneCommandeClients;

	
	private List<LigneCommandeFournisseurDto> lstLigneCommandeFournisseurs;

	 
	private List<MvtStkDto> lstMvtStks;*/
}
