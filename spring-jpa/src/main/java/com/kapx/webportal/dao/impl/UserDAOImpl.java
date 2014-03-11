package com.kapx.webportal.dao.impl;

import java.util.Collection;
import java.util.List;

import javax.persistence.TypedQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.kapx.webportal.dao.UserDAO;
import com.kapx.webportal.entity.User;

@Repository("userDAO")
public class UserDAOImpl extends AbstractBaseDAO<User, Long> implements UserDAO {

	private static final Logger logger = LoggerFactory.getLogger(UserDAOImpl.class);

	public UserDAOImpl() {
		super(User.class);
	}

	@Override
	public User save(User user) {
		super.persist(user);

		logger.debug("persist user object " + user.getId());
		return user;
	}

	@Override
	public Collection<User> findAll() {
		return super.findAll();
	}

	@Override
	public Collection<User> findAll(int page, int pageSize) {
		return super.findAll(page, pageSize);
	}

	@Override
	public User findByUsername(String username) {
		TypedQuery<User> query = (TypedQuery<User>) entityManager.createQuery("select u from User u where u.username = ?1", User.class);
		query.setParameter(1, username);
		List<User> users = query.getResultList();
		return users.iterator().next();
	}

}
