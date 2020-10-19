package my.first.project.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import my.first.project.model.User;

@Controller
public class HomeController {

	@RequestMapping(value="/home", method = RequestMethod.GET)
	public ModelAndView showLogin(HttpSession session) {
		System.out.println(session.getAttribute("userName"));
		if (session.getAttribute("userName") == null) {
			return new ModelAndView("page-login", "user", new User());
		}
		return new ModelAndView("index");
	}
	@RequestMapping(value="/index", method = RequestMethod.GET)
	public ModelAndView showIndex(HttpSession session) {
		if (session.getAttribute("user_ID") == null) {
			return new ModelAndView("page-login", "user", new User());
		}
		return new ModelAndView("index");
	}
}
