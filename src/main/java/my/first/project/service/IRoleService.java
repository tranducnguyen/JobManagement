package my.first.project.service;

import java.util.List;

import my.first.project.model.Role;
import my.first.project.model.User;

public interface IRoleService {
	void insertRole(Role role);
	void updateRole(String role_ID);
	void deleteRole(String role_ID);
	List<Role> getRoleByUser(User user);
	void assignRoleByUser (Role role, User user);
}
