package com.nnemou.gestiondestock.dto;

import java.util.List;

import lombok.Builder;
import lombok.Data;


@Builder
@Data
public class FournisseurDto {

	private String nom;
	
	private String prenom;
	
	
	private AdresseDto adresse;
	
	private String photo;
	
	private String mail;
	
	private String numTel;
	
	List<CommandeFournisseurDto> lstCommandeFournisseur;
	
	  private Integer idEntreprise;
}
