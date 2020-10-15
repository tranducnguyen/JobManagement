package my.first.project.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import my.first.project.model.User;
import my.first.project.service.IUserService;

@Controller
public class UserController {
	@Autowired
	IUserService userService;

	@RequestMapping(value = "/createuser", method = RequestMethod.GET)
	public ModelAndView createUserGet() {
		return new ModelAndView("login", "user", new User());
	}

	@RequestMapping(value = "/createuser", method = RequestMethod.POST)
	public String createUserPost(@ModelAttribute("user") User user) {
		userService.insertUser(user);
		System.out.println("Đã insert");
		return "status";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login() {
		return new ModelAndView("login", "user", new User());
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView loginData(@ModelAttribute("user") User user, HttpSession session) {
		User usercheck = userService.loginUser(user);
		ModelAndView model = new ModelAndView("status");

		if (usercheck != null) {
			model.addObject("status", user.getUser_Name() + " đăng nhập thành công");
			session.setAttribute("userName", usercheck.getUser_Name());
			session.setAttribute("password", usercheck.getUser_Password());
			session.setAttribute("user_ID", usercheck.getUser_ID());
		} else {
			model.addObject("status", "đăng nhập thất bại");
		}
		return model;
	}
}
