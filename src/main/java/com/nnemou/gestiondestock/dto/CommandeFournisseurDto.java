package com.nnemou.gestiondestock.dto;

import java.time.Instant;
import java.util.List;

import com.nnemou.gestiondestock.model.CommandeFournisseur;
import com.nnemou.gestiondestock.model.EtatCommande;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CommandeFournisseurDto {
	
	private Integer id;
	private String code;
	
	
	private Instant dateCommande;
	
	
	private FournisseurDto fournisseur;
	
	private List<LigneCommandeFournisseurDto> LstLigneCommandeFournisseurs;

	
	private Integer idEntreprise;
	
	 private EtatCommande etatCommande;
	
	public static CommandeFournisseurDto fromEntity(CommandeFournisseur commandeFournisseur) {
	    if (commandeFournisseur == null) {
	      return null;
	    }
	    return CommandeFournisseurDto.builder()
	        .id(commandeFournisseur.getId())
	        .code(commandeFournisseur.getCode())
	        .dateCommande(commandeFournisseur.getDateCommande())
	        .fournisseur(FournisseurDto.fromEntity(commandeFournisseur.getFournisseur()))
	        .etatCommande(commandeFournisseur.getEtatCommande())
	        .idEntreprise(commandeFournisseur.getIdEntreprise())
	        .build();
	  }
	
	
	public static CommandeFournisseur toEntity(CommandeFournisseurDto commandeFournisseurDto) {
	    if (commandeFournisseurDto == null) {
	      return null;
	    }
	    return CommandeFournisseur.builder()
	        .id(commandeFournisseurDto.getId())
	        .code(commandeFournisseurDto.getCode())
	        .dateCommande(commandeFournisseurDto.getDateCommande())
	        .fournisseur(FournisseurDto.toEntity(commandeFournisseurDto.getFournisseur()))
	        .etatCommande(commandeFournisseurDto.getEtatCommande())
	        .idEntreprise(commandeFournisseurDto.getIdEntreprise())
	        .build();
	  }
	
}
