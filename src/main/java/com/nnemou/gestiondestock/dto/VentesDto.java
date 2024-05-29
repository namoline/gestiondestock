package com.nnemou.gestiondestock.dto;

import java.time.Instant;

import lombok.Builder;
import lombok.Data;


@Builder
@Data
public class VentesDto {
	private String code;
	
	private Instant dateVente;
	
	private String commentaire;
	
	 private Integer idEntreprise;
}
