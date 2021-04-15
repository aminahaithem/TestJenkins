package com.sip.testJenkins.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sip.testJenkins.dao.ArticleRepository;
import com.sip.testJenkins.entities.Article;
import com.sip.testJenkins.services.ArticleServices;


@Service
@Transactional
public class ArticleServicesImp implements ArticleServices{

	@Autowired
	private ArticleRepository articleRepository;
	@Override
	public Article ajouterArticle(Article article) {
		// TODO Auto-generated method stub
		return articleRepository.save(article);
	}

	@Override
	public List<Article> findArticle() {
		// TODO Auto-generated method stub
		return articleRepository.findAll();
	}

	@Override
	public Article findArticleById(int idArticle) {
		// TODO Auto-generated method stub
		return articleRepository.findArticleByIdArticle(1);
	}
	

}
