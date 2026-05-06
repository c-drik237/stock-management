package com.makhaya.stockmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.makhaya.stockmanagement.entities.MvtStk;

public interface MvtStkRepository extends JpaRepository<Integer, MvtStk> {
    
}
