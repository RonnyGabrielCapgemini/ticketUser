package com.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	
	       //--MODIFICAR 
	
			public void update(User user);
			
			public User updateByName(String name);
			

			

}
