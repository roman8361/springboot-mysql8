package ru.kravchenko.mysql;

import com.thedeanda.lorem.Lorem;
import com.thedeanda.lorem.LoremIpsum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import ru.kravchenko.mysql.api.UserRepository;
import ru.kravchenko.mysql.entity.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AppTests {

	Lorem lorem = LoremIpsum.getInstance();

	@Autowired
	private UserRepository userRepository;

	@Test
	public void insertUser() {
		for (int i = 0; i < 10; i++) {
			userRepository.save(getNewUser());
		}

	}

	private User getNewUser() {
		final User user = new User();
		user.setName(lorem.getFirstName());
		user.setSurname(lorem.getLastName());
		return user;
	}

	@Test
	public void delUser() {
		userRepository.deleteById("79294586-4f39-42a1-9c68-863e0ae967cf");
	}

}
