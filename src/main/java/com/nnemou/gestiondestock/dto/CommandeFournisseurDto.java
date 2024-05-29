package com.nnemou.gestiondestock.dto;

import java.time.Instant;
import java.util.List;

import com.nnemou.gestiondestock.model.Fournisseur;
import com.nnemou.gestiondestock.model.LigneCommandeFournisseur;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CommandeFournisseurDto {
	
	private String code;
	
	
	private Instant dateCommande;
	
	
	private FournisseurDto fournisseur;
	
	private List<LigneCommandeFournisseurDto> LstLigneCommandeFournisseurs;

	
	private Integer idEntreprise;
}
