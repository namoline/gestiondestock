package com.nnemou.gestiondestock.dto;

import java.time.Instant;
import java.util.List;

import lombok.Builder;
import lombok.Data;


@Builder
@Data
public class CommandeClientDto {
	
	private String code;
	

	private Instant dateCommande;
	
	
	private List<LigneCommandeClientDto> LstLigneCommandeClients;
		
	private ClientDto client;
	
	private Integer idEntreprise;
}
