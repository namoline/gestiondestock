package com.nnemou.gestiondestock.validator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.nnemou.gestiondestock.dto.ArticleDto;
import com.nnemou.gestiondestock.dto.CategoryDto;



public class ArticleValidator {

	public static List<String> validate(ArticleDto articleDto){
		List<String> errors = new ArrayList<>();
		
		if(articleDto==null) {
			errors.add("Veuillez renseigner le code de l'article");
			errors.add("Veuillez renseigner La designation de l'article");
			errors.add("Veuillez renseigner le prix unitaire de l'article");
			errors.add("Veuillez renseigner le taux tva  de l'article");
			errors.add("Veuillez renseigner le prix unitaire ttc de l'article");
			errors.add("Veuillez renseigner la categorie de l'article");
			 return errors;	
		}
		
		if(!StringUtils.hasLength(articleDto.getCodeArticle())) {
			errors.add("Veuillez renseigner le code de l'article");
		}
		if(!StringUtils.hasLength(articleDto.getDesignation())) {
			errors.add("Veuillez renseigner La designation de l'article");
		}
		
		if(articleDto.getPrixUnitaireHt()==null) {
			errors.add("Veuillez renseigner le prix unitaire de l'article");
		}
		if(articleDto.getTauxTva()==null) {
			errors.add("Veuillez renseigner le taux tva  de l'article");
		}
		if(articleDto.getPrixUnitaireTtc()==null) {
			errors.add("Veuillez renseigner le prix unitaire ttc de l'article");
		}
		if(articleDto.getCategory()==null) {
			errors.add("Veuillez renseigner la categorie de l'article");
		}
		
		return errors;
	}
	

}
