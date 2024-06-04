
package com.nnemou.gestiondestock.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import com.nnemou.gestiondestock.model.Client;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ClientDto {
	
	private Integer id;
	
	private String nom;
	
	
	private String prenom;
	
	
	private AdresseDto adresse;
	
	
	private String photo;
	
	
	private String mail;
	
	
	private String numTel;
	
	
	// un client peut passer plusieurs commandes
	//une commande client appartient a un seul client
	@JsonIgnore
	List<CommandeClientDto> lstCommandeClient;
	
	private Integer idEntreprise;
	
	
	public static ClientDto fromEntity (Client client) {
		
		if(client==null) {
			return null;
		}
		
		return ClientDto.builder()
				.adresse(AdresseDto.fromEntity(client.getAdresse()))
			//	.creationDate(client.getCreationDate())
				.id(client.getId())
				.idEntreprise(client.getIdEntreprise())
				//.creationDate(client.getCreationDate())
				//.lastModifiedDate(client.getLastModifiedDate())
				//.lstCommandeClient(client.getLstCommandeClient())
				.mail(client.getMail())
				.nom(client.getNom())
				.numTel(client.getNumTel())
				.photo(client.getPhoto())
				.prenom(client.getPrenom())
				
				.build();
	}
	
	
	public static Client toEntity(ClientDto clientDto) {
		if(clientDto==null) {
			return null;
		}
		
		return Client.builder()
				.adresse(AdresseDto.toEntity(clientDto.getAdresse()))
			//	.creationDate(client.getCreationDate())
				.id(clientDto.getId())
				.idEntreprise(clientDto.getIdEntreprise())
				//.creationDate(client.getCreationDate())
				//.lastModifiedDate(client.getLastModifiedDate())
				//.lstCommandeClient(client.getLstCommandeClient())
				.mail(clientDto.getMail())
				.nom(clientDto.getNom())
				.numTel(clientDto.getNumTel())
				.photo(clientDto.getPhoto())
				.prenom(clientDto.getPrenom())
				
				.build();
	}
	
}
