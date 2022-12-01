package com.api.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.api.domain.User;
import com.api.repositories.UserRepository;

// This class adds to the database if on first use.

//@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	UserRepository repository;

	@Override
	public void run(String... args) throws Exception {
		repository.deleteAll();

		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		User davi = new User(null, "Davi Alves", "davi@gmail.com");

		repository.saveAll(Arrays.asList(maria, alex, bob,davi));
	}

}
