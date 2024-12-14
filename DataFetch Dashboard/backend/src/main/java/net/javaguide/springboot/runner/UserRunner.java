package net.javaguide.springboot.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import net.javaguide.springboot.model.User;
import net.javaguide.springboot.repository.UserRepository;

@Component
public class UserRunner implements ApplicationRunner {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        userRepository.save(new User(1, "ram", "sonawnane", "sanket@gmail.com"));
        userRepository.save(new User(2, "sham", "sonawane", "shamt@gmail.com"));
        userRepository.save(new User(3, "shums", "kadam", "shums@gmail.com"));
        userRepository.save(new User(4, "sheuru", "bhor", "ssheuru@gmail.com"));
    }
}
