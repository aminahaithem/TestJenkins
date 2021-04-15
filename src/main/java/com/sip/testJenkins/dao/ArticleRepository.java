package com.sip.testJenkins.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sip.testJenkins.entities.Article;


@RepositoryRestResource
public interface ArticleRepository extends JpaRepository<Article, Integer>{

	@Query("Select a From Article a Where a.idArticle=:idArticle")
	Article findArticleByIdArticle(@Param(value = "idArticle")int idArticle);
}
