package com.widesys.spring_postgre_test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.widesys.spring_postgre_test.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
