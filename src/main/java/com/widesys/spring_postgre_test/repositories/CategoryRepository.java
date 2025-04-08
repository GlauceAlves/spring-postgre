package com.widesys.spring_postgre_test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.widesys.spring_postgre_test.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
