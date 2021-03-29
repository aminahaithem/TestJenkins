package com.sip.testJenkins.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sip.testJenkins.entities.Article;

@RepositoryRestResource
public interface ArticleRepository extends JpaRepository<Article, Long>{

}
