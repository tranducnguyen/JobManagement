package my.first.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import my.first.project.model.User;
import my.first.project.service.UserService;

@Controller
public class UserController {
	@Autowired
	UserService userService;	
	
	@RequestMapping(value ="/create", method = RequestMethod.GET)
	public String createUser() {
		User userTest = new User();
		userTest.setUser_ID("001");
		userTest.setUser_Name("TRANTOAN");
		userTest.setUser_Password("1234");
		userService.insertUser(userTest);
		return "login";
	}
}
