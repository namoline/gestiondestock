package com.nnemou.gestiondestock.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.nnemou.gestiondestock.model.Entreprise;

import lombok.Builder;
import lombok.Data;
@Builder
@Data
public class EntrepriseDto {
	
	private Integer id;
	 
	
	private String nom;
	
	
	private AdresseDto adresse;
	
	
	private String codeFiscal;
	
	private String photo;
	
	private String email;
	
	private String numTel;
	
	private String steWeb;
	
	private String description;
	
	@JsonIgnore
	private List<UtilisateurDto> lstUtilisateur;
	
	
	public static EntrepriseDto fromEntity(Entreprise entreprise) {
	    if (entreprise == null) {
	      return null;
	    }
	    return EntrepriseDto.builder()
	        .id(entreprise.getId())
	        .nom(entreprise.getNom())
	        .description(entreprise.getDescription())
	        .adresse(AdresseDto.fromEntity(entreprise.getAdresse()))
	        .codeFiscal(entreprise.getCodeFiscal())
	        .photo(entreprise.getPhoto())
	        .email(entreprise.getEmail())
	        .numTel(entreprise.getNumTel())
	        .steWeb(entreprise.getSteWeb())
	        .build();
	  }
	
	
	public static Entreprise toEntity(EntrepriseDto entrepriseDto) {
	    if (entrepriseDto == null) {
	      return null;
	    }
	    return Entreprise.builder()
	        .id(entrepriseDto.getId())
	        .nom(entrepriseDto.getNom())
	        .description(entrepriseDto.getDescription())
	        .adresse(AdresseDto.toEntity(entrepriseDto.getAdresse()))
	        .codeFiscal(entrepriseDto.getCodeFiscal())
	        .photo(entrepriseDto.getPhoto())
	        .email(entrepriseDto.getEmail())
	        .numTel(entrepriseDto.getNumTel())
	        .steWeb(entrepriseDto.getSteWeb())
	        .build();
	  }
	
	
}
