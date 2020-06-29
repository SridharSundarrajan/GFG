package com.example.dbauth;

import com.example.dbauth.entity.User;
import com.example.dbauth.repository.MyUserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	MyUserDetailsRepository userDetailsRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		User user = new User("Sridhar","Password",true,"admin:student");
		User user1 = new User("Sundarrajan","Password",true,"student");
		userDetailsRepository.save(user);
		userDetailsRepository.save(user1);


	}
}
