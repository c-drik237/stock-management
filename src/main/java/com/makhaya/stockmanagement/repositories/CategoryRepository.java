package com.makhaya.stockmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.makhaya.stockmanagement.entities.Category;

public interface CategoryRepository extends JpaRepository<Integer, Category>{
    
}
