package com.makhaya.stockmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.makhaya.stockmanagement.entities.Article;

public interface ArticleRepository extends JpaRepository<Integer, Article>{
    
}
