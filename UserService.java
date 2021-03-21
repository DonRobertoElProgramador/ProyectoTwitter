package twatter.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import twatter.pojos.User;
import twatter.repositories.UserRepository;

@Service
public class UserService {

	
	UserRepository userrepository;
	
	@Autowired
	public UserService(UserRepository userrepository) {
		
		this.userrepository = userrepository;
		
	}	
	
	public String getSaludo(String nombreusuario) {
				
		return userrepository.getMensajeSaludo(nombreusuario);
		
	}
	
	public void addUser(User user) {
		userrepository.addUser(user);
	}
	
	
	
}
