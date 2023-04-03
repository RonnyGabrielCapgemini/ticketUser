package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.spring.model.User;
import com.spring.repository.UserRepository;
import com.spring.response.UserDTO;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserRepository urep;
	
	
	@GetMapping("/user")
    public List<UserDTO> list() {
        final List<User> all = urep.findAll();
        
        return UserDTO.of(all);
    }
	
	/*@GetMapping("/{id}")
    public UserDTO deleteById(@PathVariable int id) {
        final User user = urep.deleteById(id);
        return UserDTO.of(user);
    }*/
	
	
	@PostMapping("/save")
    public UserDTO addUser(@RequestBody User user) {
        final User u = urep.save(user);
        return UserDTO.of(u);
    }
	

	
	
	

	
}
