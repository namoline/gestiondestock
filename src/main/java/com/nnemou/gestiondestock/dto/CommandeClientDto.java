package com.nnemou.gestiondestock.dto;

import java.time.Instant;
import java.util.List;

import com.nnemou.gestiondestock.model.CommandeClient;
import com.nnemou.gestiondestock.model.EtatCommande;

import lombok.Builder;
import lombok.Data;


@Builder
@Data
public class CommandeClientDto {
	
	private Integer id;
	private String code;
	

	private Instant dateCommande;
	
	
	private List<LigneCommandeClientDto> LstLigneCommandeClients;
		
	private ClientDto client;
	
	private Integer idEntreprise;
	
	private EtatCommande etatCommande;
	
	 public static CommandeClientDto fromEntity(CommandeClient commandeClient) {
		    if (commandeClient == null) {
		      return null;
		    }
		    return CommandeClientDto.builder()
		        .id(commandeClient.getId())
		        .code(commandeClient.getCode())
		        .dateCommande(commandeClient.getDateCommande())
		        .etatCommande(commandeClient.getEtatCommande())
		        .client(ClientDto.fromEntity(commandeClient.getClient()))
		        .idEntreprise(commandeClient.getIdEntreprise())
		        .build();

		  }
	 
	 
	 public static CommandeClient toEntity(CommandeClientDto commandeClientDto) {
		    if (commandeClientDto == null) {
		      return null;
		    }
		    return CommandeClient.builder()
		        .id(commandeClientDto.getId())
		        .code(commandeClientDto.getCode())
		        .dateCommande(commandeClientDto.getDateCommande())
		        .etatCommande(commandeClientDto.getEtatCommande())
		        .client(ClientDto.toEntity(commandeClientDto.getClient()))
		        .idEntreprise(commandeClientDto.getIdEntreprise())
		        .build();

		  }
}
