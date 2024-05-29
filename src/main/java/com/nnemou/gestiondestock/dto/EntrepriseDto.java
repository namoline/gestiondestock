package com.nnemou.gestiondestock.dto;

import java.util.List;


import lombok.Builder;
import lombok.Data;
@Builder
@Data
public class EntrepriseDto {
	
	private String nom;
	
	
	private AdresseDto adresse;
	
	
	private String codeFiscal;
	
	private String photo;
	
	private String email;
	
	private String numTel;
	
	private String steWeb;
	
	private String description;
	
	private List<UtilisateurDto> lstUtilisateur;
}
