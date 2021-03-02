package twatter.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import twatter.services.UserService;

@RestController
public class UsersController {

	
@Autowired	
UserService userservice;

	
	@RequestMapping("/{nombreusuario}")
	public String getSaludo(@PathVariable String nombreusuario) {
				
		return userservice.getSaludo(nombreusuario);		
		
	}
	
	
	
	
}
