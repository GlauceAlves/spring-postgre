package com.widesys.spring_postgre_test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.widesys.spring_postgre_test.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
