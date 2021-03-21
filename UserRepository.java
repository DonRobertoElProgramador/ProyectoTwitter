package twatter.repositories;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Component;

import twatter.pojos.User;

@Component
public class UserRepository {

	
	ArrayList<User> users = new ArrayList<User>();
	
	
	public UserRepository() {
		
		addUser(new User("Roberto", "roberto@robertolandia.com"));
		
	}
	
	
	public void addUser(User user) {		
		users.add(user);		
	}
	
	public Optional<User> getUser(String name){
		
		return users.stream().filter(user -> user.getName().equals(name)).findFirst();		
		
	}
	
	
	public String getMensajeSaludo(String name) {
		
		
		if(!getUser(name).isEmpty()) {
			
			return "Hola, "+name;
			
		}		
		return "El usuario no se encuentra registrado";
	}
	
	
	
	
	
}
