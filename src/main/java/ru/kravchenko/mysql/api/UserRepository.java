package ru.kravchenko.mysql.api;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kravchenko.mysql.entity.User;

public interface UserRepository extends JpaRepository<User, String> {

}
