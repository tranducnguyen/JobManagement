package my.first.project.service.impl;




import java.util.List;

import my.first.project.model.User;

public interface UserService {
	void insertUser(User user);
	List<User> getAllUser();
	void getUserById(String userID);
	void unactiveUser(User user);
}
