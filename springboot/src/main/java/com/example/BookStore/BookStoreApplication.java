package com.example.BookStore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.BookStore.Model.User;
import com.example.BookStore.Repository.UserRepository;



@SpringBootApplication
public class BookStoreApplication  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(BookStoreApplication.class, args);
	}
@Autowired
private UserRepository userrep;
	@Override
	public void run(String... args) throws Exception {
		this.userrep.save(new User("majid", "Alawi", "jid@gmail.com"));
		
	}

}
