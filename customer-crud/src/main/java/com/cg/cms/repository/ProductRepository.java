package com.cg.cms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.cms.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	

}
