package com.sip.testJenkins.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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

	@PostMapping(value = "articles")
	public Article ajouterArticle(@RequestBody Article article) {
//		 article=new Article();
//		 article.setIdArticle(1);
//		article.setDesignation("A1");
//		article.setQte(10);
		return articleServices.ajouterArticle(article);
	}
    
	@Timed(
			value= "techprimers.hello.request",
			histogram= true,
			percentiles= {0.95,0.99},
			extraTags= {"version","1.0"}
			)
	@GetMapping(value = "articles")
	public List<Article> findArticle() {
		return articleServices.findArticle();
	};
}
