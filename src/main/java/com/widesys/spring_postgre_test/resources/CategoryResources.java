package com.widesys.spring_postgre_test.resources; 
 

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.widesys.spring_postgre_test.entities.Category;
import com.widesys.spring_postgre_test.services.CategoryService;

@RestController
@RequestMapping(value="/categories")
public class CategoryResources {
	
	@Autowired
	private CategoryService categoryService;
	
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		List<Category> list = categoryService.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id){
		Category objCategory = categoryService.findById(id);
	return ResponseEntity.ok().body(objCategory);
	}
	
	
}
