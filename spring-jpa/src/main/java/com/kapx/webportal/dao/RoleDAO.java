package com.kapx.webportal.dao;

import com.kapx.webportal.entity.Role;

public interface RoleDAO {
	Role save(Role role);

	Role findByRole(String role);
}
