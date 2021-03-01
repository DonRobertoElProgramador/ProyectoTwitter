package twatter.repositories;

import java.util.ArrayList;
import java.util.Optional;

import twatter.pojos.User;

public class UserRepository {

	
	ArrayList<User> users = new ArrayList<User>();
	
	
	public void addUser(User user) {		
		users.add(user);		
	}
	
	public Optional<User> getUser(String name){
		
		return users.stream().filter(user -> user.getName().equals(name)).findFirst();		
		
	}
	
	
	
	
	
}
