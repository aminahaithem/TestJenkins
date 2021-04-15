package com.sip.testJenkins;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.sip.testJenkins.dao.ArticleRepository;
import com.sip.testJenkins.entities.Article;
import com.sip.testJenkins.services.ArticleServices;

//import com.sip.testJenkins.dao.ArticleRepository;
//import com.sip.testJenkins.entities.Article;
//import com.sip.testJenkins.services.ArticleServices;


@SpringBootApplication
@ComponentScan(basePackages = {"com.sip.testJenkins.*"})
@EntityScan(basePackages = {"com.sip.testJenkins.*"})
@EnableJpaRepositories(basePackages = {"com.sip.testJenkins.*"})
public class TestJenkinsApplication implements CommandLineRunner{

	@Autowired
	private ArticleRepository articleRepository;
	@Autowired
	private ArticleServices articleServices;
//	@Autowired
//	private ArticleServices articleController;
	public static void main(String[] args) {
		SpringApplication.run(TestJenkinsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		Article article=new Article("a1", 3);
		Article article2=new Article("a2", 4);
		articleServices.ajouterArticle(article);
		articleServices.ajouterArticle(article2);
	articleRepository.findAll().forEach(a->System.out.println(a.toString()));
	Article a=articleServices.findArticleById(1);
	Article a2=articleServices.findArticleById(4);
		System.out.println("ArticleRepo="+a);
		System.out.println("ArticleRepo="+a2);
		//Article article=new Article("A1", 3);
		//articleController.ajouterArticle(article);
		//System.out.println("Article="+articleController.findArticle());
	}

}
