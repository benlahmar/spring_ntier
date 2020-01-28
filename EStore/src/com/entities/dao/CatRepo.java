package com.entities.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entities.Categorie;

public interface CatRepo extends JpaRepository<Categorie, Long>{

}
