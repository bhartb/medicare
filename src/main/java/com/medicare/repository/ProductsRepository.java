package com.medicare.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medicare.model.Product;

@Repository
public interface ProductsRepository extends JpaRepository<Product, Long> {
	
	public List<Product> findByName(String name);
	
	public List<Product> findByPrice(Double price);
	
	

}
