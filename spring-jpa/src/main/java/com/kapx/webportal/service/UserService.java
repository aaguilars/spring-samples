package com.kapx.webportal.service;

import java.io.Serializable;
import java.util.Collection;

import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.kapx.webportal.entity.Role;
import com.kapx.webportal.entity.User;

public interface UserService<T, PK extends Serializable> {
	T save(T t);

	Collection<T> findAll();

	Collection<T> findAll(int page, int pageSize);

	User findByUsername(String username) throws UsernameNotFoundException;

	Role findByRole(String role);
}
