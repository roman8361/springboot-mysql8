package ru.kravchenko.mysql.starter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.kravchenko.mysql.api.UserRepository;
import ru.kravchenko.mysql.entity.User;

@Component
public class AppStarter {

    @Autowired
    UserRepository userRepository;

    public void init() {
        userRepository.save(new User());
    }

}
