package my.first.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.first.project.dao.IRoleDao;
import my.first.project.model.Role;
import my.first.project.model.User;
import my.first.project.service.IRoleService;
@Service
public class RoleServiceImpl implements IRoleService{
	@Autowired
	IRoleDao roledao;

	@Override
	public void insertRole(Role role) {
		roledao.insert(role);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateRole(String role_ID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteRole(String role_ID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Role> getRoleByUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void assignRoleByUser(Role role, User user) {
		// TODO Auto-generated method stub
		
	}

}
	
	
