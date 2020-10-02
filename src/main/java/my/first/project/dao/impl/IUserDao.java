package my.first.project.dao.impl;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import my.first.project.dao.UserDao;
import my.first.project.model.User;

@Repository
public class IUserDao extends JdbcDaoSupport implements UserDao {
	@Autowired
	DataSource datasource;
	
	@PostConstruct
	private void initialize() {
		setDataSource(datasource);
	}
	
	@Override
	public void insertUser(User user) {
		String sql = "INSERT INTO USER "+"(USER_ID,USER_PASSWORD,USER_NAME) VALUES (?, ?, ?)";
		getJdbcTemplate().update(sql, new Object[] {user.getUser_ID(),user.getUser_Password(),user.getUser_Name()});
		
	}

	@Override
	public User getUserbyId(String user_id, String user_pass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateUserbyId(String user_id, String user_pass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User deleteUserbyId(String user_id, String user_pass) {
		// TODO Auto-generated method stub
		return null;
	}

}
