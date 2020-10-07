package my.first.project.dao.impl;
import java.util.List;
import java.util.Map;

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
		String x = createUserID();
		String sql = "INSERT INTO USERS " + "(USER_ID,USER_PASSWORD,USER_NAME,ACTIVE) VALUES (?, ?, ?,?)";
		getJdbcTemplate().update(sql, new Object[] { x, user.getUser_Password(), user.getUser_Name(),"1" });	
	}

	private String createUserID() {
		String sql ="SELECT COUNT(USER_ID)+1 AS SL FROM USERS";
		String so;
		String kq="";
		List<Map<String, Object>> sl = getJdbcTemplate().queryForList(sql);
		for (Map<String, Object> map : sl) {
			so = map.get("SL").toString();
			kq ="USER"+ "000".substring(0, 3-so.length())+so;
			break;
		}

		return kq;
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
