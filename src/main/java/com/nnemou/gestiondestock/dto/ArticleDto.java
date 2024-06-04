package com.nnemou.gestiondestock.dto;

import java.math.BigDecimal;

import com.nnemou.gestiondestock.model.Article;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ArticleDto {
	private Integer id;
	 
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
	
	public static ArticleDto fromEntity(Article article) {
		
		if(article == null) {
			return null;
		}
		
		return ArticleDto.builder()
				.codeArticle(article.getCodeArticle())
				.designation(article.getDesignation())
				.id(article.getId())
				.idEntreprise(article.getIdEntreprise())
				.photo(article.getPhoto())
				.prixUnitaireHt(article.getPrixUnitaireHt())
				.prixUnitaireTtc(article.getPrixUnitaireTtc())
				.tauxTva(article.getTauxTva())
				.category(CategoryDto.fromEntity(article.getCategory()))			
				.build();
				
	}
	
	
	public static Article toEntity(ArticleDto articleDto) {
		if(articleDto == null) {
			return null;
		}
		return Article.builder()
				.category(CategoryDto.toEntity(articleDto.getCategory()))
				.codeArticle(articleDto.getCodeArticle())
				.designation(articleDto.getDesignation())
				.id(articleDto.getId())
				.idEntreprise(articleDto.getIdEntreprise())	
				.photo(articleDto.getPhoto())
				.prixUnitaireHt(articleDto.prixUnitaireHt)
				.prixUnitaireTtc(articleDto.getPrixUnitaireTtc())
				.tauxTva(articleDto.getTauxTva())
				.build();
				
		
	}
	
	
}
