package my.first.project.service;

import java.util.List;

import my.first.project.model.User;

public interface UserService {
	void insertUser(User user);
	List<User> getAllUser();
	void getUserById(String userID);
	void unactiveUser(User user);
	User loginUser(User user);
}
