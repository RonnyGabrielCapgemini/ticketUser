package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import com.spring.model.User;
import com.spring.repository.UserRepository;
import com.spring.response.UserDTO;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserRepository urep;
	
	
	@GetMapping()
    public List<UserDTO> list() {
        final List<User> all = urep.findAll();
        
        return UserDTO.of(all);
    }
	
}
