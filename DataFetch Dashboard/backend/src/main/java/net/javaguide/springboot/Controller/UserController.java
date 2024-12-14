package net.javaguide.springboot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguide.springboot.model.User;
import net.javaguide.springboot.service.UserService;
@CrossOrigin(origins="http://localhost:5173")
@RestController
@RequestMapping("/api")
public class UserController {
	@Autowired 
	UserService userService;

	@GetMapping("/users")

	public List<User> getUsers() {
		return userService.getUser();
	}

}
