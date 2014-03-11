package com.kapx.webportal.dao.impl;

import java.util.List;

import javax.persistence.TypedQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.kapx.webportal.dao.RoleDAO;
import com.kapx.webportal.entity.Role;

@Repository("roleDAO")
public class RoleDAOImpl extends AbstractBaseDAO<Role, Long> implements RoleDAO {

	private static final Logger logger = LoggerFactory.getLogger(RoleDAOImpl.class);

	public RoleDAOImpl() {
		super(Role.class);
	}

	@Override
	public Role save(Role role) {
		super.persist(role);

		logger.debug("persist user object " + role.getId());
		return role;
	}

	@Override
	public Role findByRole(String role) {
		TypedQuery<Role> query = (TypedQuery<Role>) entityManager.createQuery("select r from Role r where r.role = ?1", Role.class);
		query.setParameter(1, role);

		List<Role> users = query.getResultList();

		return users.iterator().next();
	}

}
