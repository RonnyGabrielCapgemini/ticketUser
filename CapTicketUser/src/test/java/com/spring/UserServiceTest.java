package com.spring;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.spring.model.User;
import com.spring.repository.UserRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace= Replace.NONE)
public class UserServiceTest {
	
	@Autowired
	private UserRepository repo;
	
	@Test
	public void testListarUser() {
		List<User> users = (List<User>) repo.findAll();
		
		for(User producto: users) {
			System.out.println(producto);
		}
		
		// confirma si el tamaño de la lista es maypr que 0
		assertThat(users).size().isGreaterThan(0);
	}
	
	@Test
	@Rollback(false)
	public void testEliminarUser(){
		Integer id = 5;
		
		boolean esExistenteAntesDeEliminar = repo.findById(id).isPresent(); // true
		repo.deleteById(id);
		
		boolean noExistenteDespuesDeEliminar = repo.findById(id).isPresent();
		
		assertTrue(esExistenteAntesDeEliminar);
		assertFalse(noExistenteDespuesDeEliminar);
			
		
	}
	
	
	/*@Test
	@Rollback(false)
	public void GuardarUser() {
		User user = new User ();
		User userGuardado=repo.save(user);
		
		assertNotNull(userGuardado);
	}*/

}
