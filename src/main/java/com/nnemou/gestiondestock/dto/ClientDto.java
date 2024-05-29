package com.nnemou.gestiondestock.dto;

import java.util.List;


import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ClientDto {

	
	private String nom;
	
	
	private String prenom;
	
	
	private AdresseDto adresse;
	
	
	private String photo;
	
	
	private String mail;
	
	
	private String numTel;
	
	
	// un client peut passer plusieurs commandes
	//une commande client appartient a un seul client
	
	List<CommandeClientDto> lstCommandeClient;
	
	private Integer idEntreprise;
}
