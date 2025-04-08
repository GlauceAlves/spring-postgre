package com.widesys.spring_postgre_test.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.widesys.spring_postgre_test.entities.Category;
import com.widesys.spring_postgre_test.entities.Product;
import com.widesys.spring_postgre_test.repositories.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository;
	
	
	public List<Product> findAll(){
		return productRepository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> objProduct =  productRepository.findById(id);
		return objProduct.get();
	}
	
}
