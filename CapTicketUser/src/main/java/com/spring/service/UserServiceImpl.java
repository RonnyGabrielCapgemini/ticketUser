package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.model.User;
import com.spring.repository.UserRepository;


public class UserServiceImpl implements UserService {
	
	//private static final Logger log = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	UserRepository userrepo;
	
	// -- LISTAR
		public List<User> findAll(){
			return userrepo.findAll();
		}
	
	// -- MODDIFICAR
		public void update(User user) {
			userrepo.update(user);
		}
	
	// -- ELIMINAR
		public void deleteById(int id) {
			userrepo.deleteById(id);
		}
	

}
