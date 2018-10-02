package com.fsd.repository;

import org.springframework.data.repository.CrudRepository;

import com.fsd.model.Article;

public interface ArticleRepository extends CrudRepository<Article, Long> {

}