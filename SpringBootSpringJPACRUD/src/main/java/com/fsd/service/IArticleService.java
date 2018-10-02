package com.fsd.service;

import java.util.List;

import com.fsd.model.Article;

public interface IArticleService {

	public List<Article> getAllArticles();
	 
	 public Article getArticleById(long id);
	 
	 public void saveOrUpdate(Article article);
	 
	 public void deleteArticle(long id);
}
