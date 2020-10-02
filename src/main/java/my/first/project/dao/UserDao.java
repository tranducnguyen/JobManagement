package my.first.project.dao;

import my.first.project.model.User;

public interface UserDao {
	void insertUser(User user);
	User getUserbyId(String user_id, String user_pass);
	User updateUserbyId(String user_id, String user_pass);
	User deleteUserbyId(String user_id, String user_pass);
}
