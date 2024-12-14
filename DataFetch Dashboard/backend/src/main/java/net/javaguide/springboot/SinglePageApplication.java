package net.javaguide.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguide.springboot.model.User;
import net.javaguide.springboot.repository.UserRepository;

@SpringBootApplication
public class SinglePageApplication  {

	public static void main(String[] args) {
		SpringApplication.run(SinglePageApplication.class, args);
	}
  

}
