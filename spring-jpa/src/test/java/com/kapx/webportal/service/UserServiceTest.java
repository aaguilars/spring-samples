package com.kapx.webportal.service;

import java.util.Collection;

import org.apache.commons.collections.CollectionUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import com.kapx.webportal.entity.Role;
import com.kapx.webportal.entity.User;

@ContextConfiguration(locations = "classpath:spring-context/spring-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
public class UserServiceTest extends AbstractTransactionalJUnit4SpringContextTests {

	private static final Logger logger = LoggerFactory.getLogger(UserServiceTest.class);

	@Autowired
	private UserService<User, Long> userService;

	// @Test
	public void save() {
		Role role = null;
		User user = null;

		try {
			role = userService.findByRole("ROLE_ADMIN");

			user = new User();
			user.setFirstName("DE");
			user.setLastName("KAPX");
			user.setUsername("dekapx");
			user.setPassword("password");
			user.setEmail("dekapx@gmail.com");
			user.setRole(role);

			userService.save(user);

			role = userService.findByRole("ROLE_USER");

			user = new User();
			user.setFirstName("TEST");
			user.setLastName("USER");
			user.setUsername("testuser");
			user.setPassword("password");
			user.setEmail("test@gmail.com");
			user.setRole(role);

			userService.save(user);

			logger.debug("save user object");
		} catch (Exception e) {
			logger.error("Exception while saving User object.", e);
		}
	}

	// @Test
	public void getAll() {
		Collection<User> users = userService.findAll(1, 2);
		if (CollectionUtils.isNotEmpty(users)) {
			for (User user : users) {
				System.out.println(user.getUsername());
			}
		}
	}

	@Test
	public void findByUsername() {
		String username = "dekapx";

		try {
			User user = userService.findByUsername(username);
			logger.info("find by user name " + user.getUsername());
		} catch (UsernameNotFoundException e) {
			logger.error("error for searching username {}", username, e);
		}
	}
}
