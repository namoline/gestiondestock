package com.nnemou.gestiondestock.dto;

import java.math.BigDecimal;
import java.time.Instant;

import com.nnemou.gestiondestock.model.TypeMvtStock;

import lombok.Builder;
import lombok.Data;


@Builder
@Data
public class MvtStkDto {
	
    private Instant dateMvt;
	
	
	private BigDecimal quantite;
	
	
	private ArticleDto article;
	
	
	private TypeMvtStock typemvt;
	
	
	private Integer idEntreprise;
}
