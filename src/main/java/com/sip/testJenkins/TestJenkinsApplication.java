package com.sip.testJenkins;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sip.testJenkins.controllers.ArticleController;
import com.sip.testJenkins.dao.ArticleRepository;
import com.sip.testJenkins.entities.Article;

@SpringBootApplication
public class TestJenkinsApplication implements CommandLineRunner{

	@Autowired
	private ArticleRepository articleRepository;
	@Autowired
	private ArticleController articleController;
	public static void main(String[] args) {
		SpringApplication.run(TestJenkinsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		Article article=articleController.ajouterArticle(new Article(1, "A1", 3));
		System.out.println("Article="+articleRepository.findAll());
	}

}
