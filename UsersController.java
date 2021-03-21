package twatter.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import twatter.pojos.User;
import twatter.services.UserService;

@RestController
public class UsersController {

	
@Autowired	
UserService userservice;

	
	@RequestMapping("/{nombreusuario}")
	public String getSaludo(@PathVariable String nombreusuario) {
				
		return userservice.getSaludo(nombreusuario);		
		
	}
	
	@PostMapping(path="/register")
	public void registerUser(@RequestBody User nuevoUser) {
		
		userservice.addUser(nuevoUser);
		
	}
	
	
	
	
}
