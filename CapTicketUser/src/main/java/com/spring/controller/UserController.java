package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.spring.model.User;
import com.spring.response.UserDTO;
import com.spring.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService service;
	
	 
	@GetMapping("/users")
    public List<UserDTO> list() {
        final List<User> all = service.findAll();       
        return UserDTO.of(all);
    }
	
	/*@GetMapping("/{id}")
    public UserDTO deleteById(@PathVariable int id) {
        final User user = urep.deleteById(id);
        return UserDTO.of(user);
    }*/
	
	
	@PostMapping("/save")
    public UserDTO addUser(@RequestBody User user) {
        final User u = service.save(user);
        return UserDTO.of(u);
    }
	

	
	
	

	
}
