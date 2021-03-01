package twatter;

import org.junit.jupiter.api.Test;

import twatter.repositories.UserRepository;

public class Tests {

	@Test
	public void Test1() {
		
		UserRepository urep = new UserRepository();
		assert(!urep.getUser("cualquiercosa").isPresent());
		
	}
	
	
	
}
