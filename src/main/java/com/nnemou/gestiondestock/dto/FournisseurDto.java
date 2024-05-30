package com.nnemou.gestiondestock.dto;

import java.util.List;

import com.nnemou.gestiondestock.model.Fournisseur;

import lombok.Builder;
import lombok.Data;


@Builder
@Data
public class FournisseurDto {
	private Integer id;
	private String nom;
	
	private String prenom;
	
	
	private AdresseDto adresse;
	
	private String photo;
	
	private String mail;
	
	private String numTel;
	
	List<CommandeFournisseurDto> lstCommandeFournisseur;
	
	  private Integer idEntreprise;

	public static FournisseurDto fromEntity(Fournisseur fournisseur) {
		// TODO Auto-generated method stub
		
		
		 if (fournisseur == null) {
		      return null;
		    }
		    return FournisseurDto.builder()
		        .id(fournisseur.getId())
		        .nom(fournisseur.getNom())
		        .prenom(fournisseur.getPrenom())
		        .adresse(AdresseDto.fromEntity(fournisseur.getAdresse()))
		        .photo(fournisseur.getPhoto())
		        .mail(fournisseur.getMail())
		        .numTel(fournisseur.getNumTel())
		        .idEntreprise(fournisseur.getIdEntreprise())
		        .build();
	}

	

	public static Fournisseur toEntity(FournisseurDto fournisseurDto) {
		// TODO Auto-generated method stub
		 if (fournisseurDto == null) {
		      return null;
		    }
		    return Fournisseur.builder()
		        .id(fournisseurDto.getId())
		        .nom(fournisseurDto.getNom())
		        .prenom(fournisseurDto.getPrenom())
		        .adresse(AdresseDto.toEntity(fournisseurDto.getAdresse()))
		        .photo(fournisseurDto.getPhoto())
		        .mail(fournisseurDto.getMail())
		        .numTel(fournisseurDto.getNumTel())
		        .idEntreprise(fournisseurDto.getIdEntreprise())
		        .build();
	}
}
