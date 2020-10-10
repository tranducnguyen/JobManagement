package my.first.project.controller;

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

	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public ModelAndView create() {
		return new ModelAndView("login", "user", new User());
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String createUser(@ModelAttribute("user") User user) {
		userService.insertUser(user);
		System.out.println("Đã insert");
		return "status";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login() {
		return new ModelAndView("login", "user", new User());
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView loginData(@ModelAttribute("user") User user) {
		User usercheck = userService.loginUser(user);
		ModelAndView model = new ModelAndView("status");

		if (usercheck != null) {
			model.addObject("status", user.getUser_Name() + " đăng nhập thành công");
		} else {
			model.addObject("status", "đăng nhập thất bại");
		}
		return model;
	}
}
