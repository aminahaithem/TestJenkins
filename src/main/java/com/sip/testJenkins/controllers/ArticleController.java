package com.sip.testJenkins.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sip.testJenkins.entities.Article;
import com.sip.testJenkins.services.ArticleServices;

import io.micrometer.core.annotation.Timed;



@RestController
@CrossOrigin("*")
@RequestMapping("/")
public class ArticleController {

	@Autowired
	private ArticleServices articleServices;
	private Logger logger=LoggerFactory.getLogger(ArticleController.class);
	
	@GetMapping(value="articles/{idArticle}")
public Article findArticleById(@PathVariable(name = "idArticle")int idArticle) {
		List<Article> articles=findArticle();
		Article article=articles.stream().filter(
				a->a.getIdArticle()==idArticle).findAny().orElse(null);
		if(article!=null)
		{
			logger.info("Article found: {}",article);
		return article;
		}else
		{
			try {
				throw new Exception();
			}catch(Exception e) {
				e.printStackTrace();
				logger.error("User Not Found with ID : {}",idArticle);
			}
			return new Article();
		}
	}

	
    
    
    @Timed(
			value= "postArticles",
			histogram= true,
			percentiles= {0.95,0.99},
			extraTags= {"version","1.0"}
			)
	@PostMapping(value = "articles")
	public Article ajouterArticle(@RequestBody Article article) {
			
			logger.trace("Article est ajouter");
		return articleServices.ajouterArticle(article);
		
	}
    
	@Timed(
			value= "getArticles",
			histogram= true,
			percentiles= {0.95,0.99},
			extraTags= {"version","1.0"}
			)
	@GetMapping(value = "articles")
	public List<Article> findArticle() {
		
			logger.trace("FindArticles");
			
		return articleServices.findArticle();
		
	}
	
	
	
	
}
