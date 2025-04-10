package com.widesys.spring_postgre_test.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.widesys.spring_postgre_test.entities.User;
import com.widesys.spring_postgre_test.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> objUser =  userRepository.findById(id);
		return objUser.get();
	}

	public User insert(User obj) {
		return userRepository.save(obj);
	}
	
	public void deleteById(Long id) {
		userRepository.deleteById(id);
	}
	
	public User updateById(Long id, User obj) {
		User entity = userRepository.getReferenceById(id);
	    updateData(entity, obj);
		return userRepository.save(entity);
	}
	
	public void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}
	
}
