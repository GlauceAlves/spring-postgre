package com.widesys.spring_postgre_test.resources; 
 

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.widesys.spring_postgre_test.entities.User;
import com.widesys.spring_postgre_test.services.UserService;

@RestController
@RequestMapping(value="/users")
public class UserResources {
	
	@Autowired
	private UserService userService;
	
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
//		User u = new User(1L, "Maria", "maria@gmail.com", "99999999", "123456");
		List<User> list = userService.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id){
	User objUser = userService.findById(id);
	return ResponseEntity.ok().body(objUser);
	}
	
	
}
