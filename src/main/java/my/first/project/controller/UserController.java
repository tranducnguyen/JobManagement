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

	@RequestMapping(value = "/controller/page-register", method = RequestMethod.GET)
	public ModelAndView createUserGet() {
		return new ModelAndView("page-register", "user", new User());
	}

	@RequestMapping(value = "/createuser", method = RequestMethod.POST)
	public String createUserPost(@ModelAttribute("user") User user) {
		userService.insertUser(user);
		return "index";
	}

	@RequestMapping(value = "/page-login", method = RequestMethod.GET)
	public ModelAndView login() {
		return new ModelAndView("page-login", "user", new User());
	}

	@RequestMapping(value = "/page-login", method = RequestMethod.POST)
	public ModelAndView loginData(@ModelAttribute("user") User user, HttpSession session) {
		User usercheck = userService.loginUser(user);
		if (usercheck != null) {
			ModelAndView model = new ModelAndView("index");
			model.addObject("user", usercheck);
			session.setAttribute("userName", usercheck.getUser_Name());
			session.setAttribute("password", usercheck.getUser_Password());
			session.setAttribute("user_ID", usercheck.getUser_ID());
			return model;
		} else {
			ModelAndView model = new ModelAndView("page-login");
			model.addObject("note", "đăng nhập thất bại, vui lòng nhập lại mật khẩu");
			return model;
		}
	}
	
//	Logout trả về trang login
	@RequestMapping(value = "/controller/logout", method = RequestMethod.GET)
	public ModelAndView logoutUser(HttpSession session) {	
		session.removeAttribute("userName");
		return new ModelAndView("page-login", "user", new User());
	}
	
}
