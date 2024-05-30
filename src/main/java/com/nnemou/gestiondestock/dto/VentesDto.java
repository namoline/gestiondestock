package com.nnemou.gestiondestock.dto;

import java.time.Instant;

import com.nnemou.gestiondestock.model.Ventes;

import lombok.Builder;
import lombok.Data;


@Builder
@Data
public class VentesDto {
	private Integer id;
	private String code;
	
	private Instant dateVente;
	
	private String commentaire;
	
	 private Integer idEntreprise;

	public static VentesDto fromEntity(Ventes vente) {
		// TODO Auto-generated method stub
		 if (vente == null) {
		      return null;
		    }
		    return VentesDto.builder()
		        .id(vente.getId())
		        .code(vente.getCode())
		        .commentaire(vente.getCommentaire())
		        .idEntreprise(vente.getIdEntreprise())
		        .build();
	}

	public static Ventes toEntity(VentesDto venteDto) {
		// TODO Auto-generated method stub
		 if (venteDto == null) {
		      return null;
		    }
		    return Ventes.builder()
		        .id(venteDto.getId())
		        .code(venteDto.getCode())
		        .commentaire(venteDto.getCommentaire())
		        .idEntreprise(venteDto.getIdEntreprise())
		        .build();
	}
}
