package com.nnemou.gestiondestock.dto;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

import com.nnemou.gestiondestock.model.Utilisateur;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UtilisateurDto {
	private Integer id;
	private String nom;
	
	
	private String prenom;
	
	
	private AdresseDto adresse;
	
	
	private String motDepasse;
	
	
	private Instant dateNaissance;
	
	
	private String photo;
	
	
	private String email;
	
	
	
	private EntrepriseDto entreprise;
	
	
	private List<RolesDto> lstRoles;
	
	
	 public static UtilisateurDto fromEntity(Utilisateur utilisateur) {
		    if (utilisateur == null) {
		      return null;
		    }

		    return UtilisateurDto.builder()
		        .id(utilisateur.getId())
		        .nom(utilisateur.getNom())
		        .prenom(utilisateur.getPrenom())
		        .email(utilisateur.getEmail())
		        .motDepasse(utilisateur.getMotDepasse())
		        .dateNaissance(utilisateur.getDateNaissance())
		        .adresse(AdresseDto.fromEntity(utilisateur.getAdresse()))
		        .photo(utilisateur.getPhoto())
		        .entreprise(EntrepriseDto.fromEntity(utilisateur.getEntreprise()))
		        .lstRoles(
		            utilisateur.getLstRoles() != null ?
		                utilisateur.getLstRoles().stream()
		                    .map(RolesDto::fromEntity)
		                    .collect(Collectors.toList()) : null
		        )
		        .build();
		  }
	 
	 
	 
	 public static Utilisateur toEntity(UtilisateurDto utilisateurDto) {
		    if (utilisateurDto == null) {
		      return null;
		    }

		    return Utilisateur.builder()
		        .id(utilisateurDto.getId())
		        .nom(utilisateurDto.getNom())
		        .prenom(utilisateurDto.getPrenom())
		        .email(utilisateurDto.getEmail())
		        .motDepasse(utilisateurDto.getMotDepasse())
		        .dateNaissance(utilisateurDto.getDateNaissance())
		        .adresse(AdresseDto.toEntity(utilisateurDto.getAdresse()))
		        .photo(utilisateurDto.getPhoto())
		        .entreprise(EntrepriseDto.toEntity(utilisateurDto.getEntreprise()))
		       /* .lstRoles(
		        		utilisateurDto.getLstRoles() != null ?
		        				utilisateurDto.getLstRoles().stream()
		                    .map(RolesDto::toEntity)
		                    .collect(Collectors.toList()) : null
		        )*/
		        .build();
		  }
}
