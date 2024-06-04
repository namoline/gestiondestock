package com.nnemou.gestiondestock.validator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.nnemou.gestiondestock.dto.ClientDto;

public class ClientValidator {

	
	
	public static List<String> validate(ClientDto clientDto){
		  List<String> errors = new ArrayList<>();
		  
		  if(clientDto==null) {
			  errors.add("Veuillez renseigner le nom du client");
			  errors.add("Veuillez renseigner le prenom du client");
			  errors.add("Veuillez renseigner le mail du client");
			  errors.add("Veuillez renseigner le numero de telephone du client");
			  return errors;	
		  }
		  
		  if(!StringUtils.hasLength(clientDto.getNom())) {
			  errors.add("Veuillez renseigner le nom du client");
			     
		  }
		  if(!StringUtils.hasLength(clientDto.getNom())) {
			  errors.add("Veuillez renseigner le nom du client");
			     
		  }
		  if(!StringUtils.hasLength(clientDto.getPrenom())) {
			  errors.add("Veuillez renseigner le prenom du client");
			     
		  }
		  if(!StringUtils.hasLength(clientDto.getMail())) {
			  errors.add("Veuillez renseigner le mail du client");
			     
		  }
		 /* if(clientDto.getAdresse()==null) {
			  errors.add("Veuillez renseigner l'adresse du client");
			     
		  }*/
		  
		  if(!StringUtils.hasLength(clientDto.getNumTel())) {
			  errors.add("Veuillez renseigner le numero de telephone du client");
			     
		  }
		  
		  return errors;
	}
}
