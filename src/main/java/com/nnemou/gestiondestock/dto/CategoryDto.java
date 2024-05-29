package com.nnemou.gestiondestock.dto;

import java.util.List;

import com.nnemou.gestiondestock.model.Article;


import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CategoryDto {
	
	private String code;
	
	
	private String designation;
	
	
	private List<Article> lstArticle;
	
	
	private Integer idEntreprise;

}
