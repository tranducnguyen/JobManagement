package my.first.project.dao;


import my.first.project.model.Role;
import my.first.project.model.User;

public interface IRoleDao {
	void insert(Role role);
	User getRoleByID(String role_id);
	User updateRoleByID(String role_id);
	User deleteRoleByID(String role_id);
}
