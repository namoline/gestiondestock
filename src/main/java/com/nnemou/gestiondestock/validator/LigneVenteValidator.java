package com.nnemou.gestiondestock.validator;


import java.util.ArrayList;
import java.util.List;

import com.nnemou.gestiondestock.dto.LigneVenteDto;



public class LigneVenteValidator {

	public static List<String> validate(LigneVenteDto dto) {
	    List<String> errors = new ArrayList<>();
	    
	    if(dto==null) {
	    	 errors.add("Veuillez renseigner l'article ");
	    	 errors.add("Veuillez renseigner la vente");
	    	 errors.add("Veuillez renseigner le prix unitaire");
	    	 errors.add("Veuillez renseigner la quantite");
	    	 return errors;
	    }
	    
	    
	    if (dto.getArticle()==null || dto.getArticle().getId()==null) {
		      errors.add("Veuillez renseigner l'article ");
		  }
	    if (dto.getVente()==null || dto.getVente().getId()==null) {
		      errors.add("Veuillez renseigner la vente");
		  }
	    if (dto.getPrixUnitaire()==null) {
		      errors.add("Veuillez renseigner le prix unitaire");
		  }
	    if (dto.getQuantite()==null) {
		      errors.add("Veuillez renseigner la quantite");
		  }
	    
	    
	    return errors;
	  }

}
