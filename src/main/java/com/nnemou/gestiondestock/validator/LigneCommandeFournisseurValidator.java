package com.nnemou.gestiondestock.validator;

import java.util.ArrayList;
import java.util.List;

import com.nnemou.gestiondestock.dto.LigneCommandeClientDto;
import com.nnemou.gestiondestock.dto.LigneCommandeFournisseurDto;

public class LigneCommandeFournisseurValidator {
	 public static List<String> validate(LigneCommandeFournisseurDto dto) {
		    List<String> errors = new ArrayList<>();
		    
		    if(dto==null) {
		    	 errors.add("Veuillez renseigner l'article de la commande");
		    	 errors.add("Veuillez renseigner la commande client de la commande");
		    	 errors.add("Veuillez renseigner le prix unitaire de la commande");
		    	 errors.add("Veuillez renseigner la quantite de la commande");
		    	 return errors;
		    }
		    
		    
		    if (dto.getArticle()==null || dto.getArticle().getId()==null) {
			      errors.add("Veuillez renseigner l'article de la commande");
			  }
		    if (dto.getCommandeFournisseur()==null || dto.getCommandeFournisseur().getId()==null) {
			      errors.add("Veuillez renseigner la commande client de la commande");
			  }
		    if (dto.getPrixUnitaire()==null) {
			      errors.add("Veuillez renseigner le prix unitaire de la commande");
			  }
		    if (dto.getQuantite()==null) {
			      errors.add("Veuillez renseigner la quantite de la commande");
			  }
		    
		    
		    return errors;
		  }


}
