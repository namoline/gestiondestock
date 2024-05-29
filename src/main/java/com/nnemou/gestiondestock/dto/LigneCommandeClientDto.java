package com.nnemou.gestiondestock.dto;

import java.math.BigDecimal;


import lombok.Builder;
import lombok.Data;


@Builder
@Data
public class LigneCommandeClientDto {
	
	private ArticleDto article;
	
	CommandeClientDto commandeClient;
	
	private BigDecimal quantite;
	
	private BigDecimal prixUnitaire;
	
	private Integer idEntreprise;
}
