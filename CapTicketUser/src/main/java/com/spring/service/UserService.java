package com.spring.service;

import java.util.List;


import com.spring.model.User;



public interface UserService {
	
	//--LISTAR 
		public List<User> findAll();
		
	//--MODIFICAR
		
		public void update(User user);
		
	//--ELIMINAR
		
		public void deleteById(int id);
		
	//-- GUARDAR
		
		public User save(User user);
	
	

}
