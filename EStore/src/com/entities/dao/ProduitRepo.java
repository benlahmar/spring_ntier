package com.entities.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entities.Produit;

public interface ProduitRepo extends JpaRepository<Produit, Long>{

}
