package com.nnemou.gestiondestock.dto;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class LigneVenteDto {

	
	
	private VentesDto vente;
	
	private BigDecimal quantite;
	
//@nan: voir si c'est bon
	private ArticleDto article;
	
	private BigDecimal prixUnitaire;
	
	private Integer idEntreprise;
}
