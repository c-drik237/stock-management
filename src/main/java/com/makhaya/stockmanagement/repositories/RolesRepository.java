package com.makhaya.stockmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.makhaya.stockmanagement.entities.Roles;

public interface RolesRepository extends JpaRepository<Integer, Roles> {
    
}
