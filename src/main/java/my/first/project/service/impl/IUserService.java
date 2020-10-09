package my.first.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.first.project.dao.UserDao;
import my.first.project.model.User;
import my.first.project.service.UserService;

@Service
public class IUserService implements UserService {

	@Autowired
	UserDao userDao;
	
	@Override
	public void insertUser(User user) {
		userDao.insertUser(user);
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void getUserById(String userID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unactiveUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User loginUser(User user) {
		List<User> usercheck = userDao.getUserByName(user.getUser_Name());
		for (User user2 : usercheck) {
			if (user2.getUser_Password().compareTo(user.getUser_Password())==0) {
				return user2;
			}
		}
		return null;
	}

}
