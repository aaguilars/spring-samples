package com.kapx.webportal.service.impl;

import java.util.Collection;

import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.google.common.base.Preconditions;
import com.kapx.webportal.dao.RoleDAO;
import com.kapx.webportal.dao.UserDAO;
import com.kapx.webportal.entity.Role;
import com.kapx.webportal.entity.User;
import com.kapx.webportal.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService<User, Long> {
	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

	@Autowired
	@Qualifier("userDAO")
	private UserDAO userDAO;

	@Autowired
	@Qualifier("roleDAO")
	private RoleDAO roleDAO;

	@Override
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public User save(User user) {
		logger.debug("Save user object...");
		Preconditions.checkNotNull(user, "User object is null.");

		return userDAO.save(user);
	}

	@Override
	public Collection<User> findAll() {
		return userDAO.findAll();
	}

	@Override
	public Collection<User> findAll(int page, int pageSize) {
		Collection<User> users = userDAO.findAll(page, pageSize);

		Preconditions.checkArgument(CollectionUtils.isNotEmpty(users), "Unable to load all the users");

		return userDAO.findAll(page, pageSize);
	}

	@Override
	public User findByUsername(String username) throws UsernameNotFoundException {
		try {
			Preconditions.checkNotNull(username, "Username should not be null.");

			User userEntity = userDAO.findByUsername(username);
			Preconditions.checkNotNull(userEntity, "Unable to find the username " + username);

			return userEntity;
		} catch (Exception e) {
			throw new UsernameNotFoundException("Unable to find the user " + username);
		}
	}

	@Override
	public Role findByRole(String role) {

		Preconditions.checkNotNull(role, "Role should not be null.");

		return roleDAO.findByRole(role);
	}

}
