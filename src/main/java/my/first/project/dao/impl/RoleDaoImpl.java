package my.first.project.dao.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import my.first.project.dao.IRoleDao;
import my.first.project.model.Role;
import my.first.project.model.User;

@Repository
public class RoleDaoImpl extends JdbcDaoSupport implements IRoleDao {
	@Autowired
	DataSource datasource;

	@PostConstruct
	private void initialize() {
		setDataSource(datasource);
	}

	@Override
	public void insert(Role role) {

		String jobID = createRoleID();
		String sql = "INSERT INTO ROLES " + "(ROLE_ID,ROLE_NM,MENU_ID) VALUES (?, ?, ?";
		getJdbcTemplate().update(sql, new Object[] { jobID, role.getRole_ID(),role.getRole_NM(),role.getMenu_ID() });

	}

	private String createRoleID() {
		String sql = "SELECT COUNT(ROLE_ID)+1 AS SL FROM ROLES";
		String so;
		String kq = "";
		List<Map<String, Object>> sl = getJdbcTemplate().queryForList(sql);
		for (Map<String, Object> map : sl) {
			so = map.get("SL").toString();
			kq = "ROLE" + "000".substring(0, 3 - so.length()) + so;
			break;
		}
		return kq;
	}

	@Override
	public User getRoleByID(String role_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateRoleByID(String role_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User deleteRoleByID(String role_id) {
		// TODO Auto-generated method stub
		return null;
	}

}
