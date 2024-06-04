package com.nnemou.gestiondestock.validator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.nnemou.gestiondestock.dto.LigneCommandeClientDto;

public class LigneCommandeClientValidator {

	
	 public static List<String> validate(LigneCommandeClientDto dto) {
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
		    if (dto.getCommandeClient()==null || dto.getCommandeClient().getId()==null) {
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
