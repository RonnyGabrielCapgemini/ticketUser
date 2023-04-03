package com.spring.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.spring.controller.UserController;
import com.spring.model.User;
import com.spring.repository.UserRepository;


public class UserServiceImpl implements UserService {
	
	private static final Logger log = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	UserRepository userrepo;
	
	// -- LISTAR
		public List<User> findAll(){
			return userrepo.findAll();
		}
	
	
	// -- ELIMINAR
		public void deleteById(int id) {
			userrepo.deleteById(id);
		}
		
	// -- GUARDAR
		public User save(User user) {
			return userrepo.save(user);
		}
	

}
