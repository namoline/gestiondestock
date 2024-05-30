package com.nnemou.gestiondestock.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.nnemou.gestiondestock.model.Article;
import com.nnemou.gestiondestock.model.Category;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CategoryDto {
	private Integer id;
	private String code;
	
	
	private String designation;
	
	@JsonIgnore
	private List<Article> lstArticle;
	
	
	private Integer idEntreprise;
	
	//mapping de category ->categoryDTO
	public static CategoryDto fromEntity (Category category) {
		
		if (category==null) {
			return null;
			//@toto throw exceptio,
		}
		
		return CategoryDto.builder()
				.code(category.getCode())
				.designation(category.getDesignation())
				.id(category.getId())
				//.idEntreprise(category.getIdEntreprise())
				.build();
			
		
	}

	
	
	public static Category toEntity(CategoryDto categoryDto) {
		
		if (categoryDto==null) {
			return null;
			//@toto throw exceptio,
		}
		
		return Category.builder()
				.id(categoryDto.getId())
				.code(categoryDto.getCode())
				.designation(categoryDto.getDesignation())
				//.idEntreprise(categoryDto.getIdEntreprise())
				.id(categoryDto.getId())
				.build();
				
		
		
	}
}
