package com.kapx.webportal.dao;

import java.util.Collection;

import com.kapx.webportal.entity.User;

public interface UserDAO {
	User save(User entity);

	Collection<User> findAll();

	Collection<User> findAll(int page, int pageSize);

	User findByUsername(String username);
}
