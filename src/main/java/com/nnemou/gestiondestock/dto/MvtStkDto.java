package com.nnemou.gestiondestock.dto;

import java.math.BigDecimal;
import java.time.Instant;

import com.nnemou.gestiondestock.model.MvtStk;
import com.nnemou.gestiondestock.model.SourceMvtStk;
import com.nnemou.gestiondestock.model.TypeMvtStock;

import lombok.Builder;
import lombok.Data;


@Builder
@Data
public class MvtStkDto {
	private Integer id;
    private Instant dateMvt;
	
	
	private BigDecimal quantite;
	
	
	private ArticleDto article;
	
	
	private TypeMvtStock typeMvt;
	
	
	private Integer idEntreprise;
	
	private SourceMvtStk sourceMvt;
	
	public static MvtStkDto fromEntity(MvtStk mvtStk) {
	    if (mvtStk == null) {
	      return null;
	    }

	    return MvtStkDto.builder()
	        .id(mvtStk.getId())
	        .dateMvt(mvtStk.getDateMvt())
	        .quantite(mvtStk.getQuantite())
	        .article(ArticleDto.fromEntity(mvtStk.getArticle()))
	        .typeMvt(mvtStk.getTypeMvt())
	        .sourceMvt(mvtStk.getSourceMvt())
	        .idEntreprise(mvtStk.getIdEntreprise())
	        .build();
	  }
	
	
	public static MvtStk toEntity(MvtStkDto mvtStkDto) {
	    if (mvtStkDto == null) {
	      return null;
	    }

	    return MvtStk.builder()
	        .id(mvtStkDto.getId())
	        .dateMvt(mvtStkDto.getDateMvt())
	        .quantite(mvtStkDto.getQuantite())
	        .article(ArticleDto.toEntity(mvtStkDto.getArticle()))
	        .typeMvt(mvtStkDto.getTypeMvt())
	        .sourceMvt(mvtStkDto.getSourceMvt())
	        .idEntreprise(mvtStkDto.getIdEntreprise())
	        .build();
	  }

}
