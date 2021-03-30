package com.sip.testJenkins;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.sip.testJenkins.controllers.ArticleController;
import com.sip.testJenkins.entities.Article;
import com.sip.testJenkins.services.ArticleServices;

@SpringBootApplication
@ComponentScan(basePackages = {"com.sip.testJenkins.*"})
@EntityScan(basePackages = {"com.sip.testJenkins.*"})
@EnableJpaRepositories(basePackages = {"com.sip.testJenkins.*"})
public class TestJenkinsApplication implements CommandLineRunner{

//	@Autowired
//	private ArticleRepository articleRepository;
	@Autowired
	private ArticleServices articleController;
	public static void main(String[] args) {
		SpringApplication.run(TestJenkinsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		//Article article=new Article("A1", 3);
		//articleController.ajouterArticle(article);
		//System.out.println("Article="+articleController.findArticle());
	}

}
