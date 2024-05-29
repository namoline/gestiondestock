package com.nnemou.gestiondestock.dto;

import java.time.Instant;
import java.util.List;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UtilisateurDto {
	
	private String nom;
	
	
	private String prenom;
	
	
	private AdresseDto adresse;
	
	
	private String motDepasse;
	
	
	private Instant dateNaissance;
	
	
	private String photo;
	
	
	private String email;
	
	
	
	private EntrepriseDto entreprise;
	
	
	private List<RolesDto> lstRoles;
}
