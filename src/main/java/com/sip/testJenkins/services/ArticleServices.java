package com.sip.testJenkins.services;

import java.util.List;

import com.sip.testJenkins.entities.Article;

//import com.sip.testjenkins.entities.Article;

public interface ArticleServices {
public Article ajouterArticle(Article article);
public List<Article>findArticle();
public Article findArticleById(int idArticle);
}
