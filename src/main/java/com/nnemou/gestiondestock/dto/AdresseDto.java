package com.nnemou.gestiondestock.dto;

import com.nnemou.gestiondestock.model.Adresse;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AdresseDto {
	
	 //private Integer id;
	
	 private String adresse1;
	 
	 
	 private String adresse2;
	 
	 
	 private String ville;
	 
	 
	 private String codePostal;

	 
	 private String pays;
	 
	 
	 public static AdresseDto fromEntity(Adresse adresse) {
		 
		 if(adresse==null) {
			 return null;
		 }
		 return AdresseDto.builder()
				 .adresse1(adresse.getAdresse1())
				 .adresse2(adresse.getAdresse2())
				 .codePostal(adresse.getCodePostal())
				 .pays(adresse.getPays())
				 .ville(adresse.getVille())
				 .build();
		 
	 }
	 
	 
	 public static Adresse toEntity(AdresseDto adresseDto) {
		 
		 if(adresseDto==null) {
			 return null;
		 }
		 
		 return Adresse.builder()
				 .adresse1(adresseDto.getAdresse1())
				 .adresse2(adresseDto.getAdresse2())
				 .codePostal(adresseDto.getCodePostal())
				 .pays(adresseDto.getPays())
				 .ville(adresseDto.getVille())
				 .build();
	 }
}
