package com.nnemou.gestiondestock.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nnemou.gestiondestock.model.Article;

public interface ArticleRepository extends JpaRepository<Article, Integer>{

	  Article findByCodeArticle(String codeArticle);

	  List<Article> findAllByCategoryId(Integer idCategory);
	
}
