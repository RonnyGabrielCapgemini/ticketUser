package com.spring.service;

import java.util.List;


import com.spring.model.User;



public interface UserService {
	
	//--LISTAR 
		public List<User> findAll();	
	//--ELIMINAR		
		public void deleteById(int id);		
	//-- GUARDAR		
		public User save(User user);
	
	

}
