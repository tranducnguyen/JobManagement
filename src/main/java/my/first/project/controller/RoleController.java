package my.first.project.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import my.first.project.model.Role;
import my.first.project.service.IRoleService;

@Controller
public class RoleController {
	@Autowired
	IRoleService roleService;
	
	@RequestMapping(value ="/createRole", method = RequestMethod.GET)
	public ModelAndView createRole_GET() {
			return new ModelAndView("roles", "role", new Role());
	}
	
	@RequestMapping(value ="/createRole", method = RequestMethod.POST)
	public ModelAndView createRole_POST(@ModelAttribute("role") Role role, HttpSession session) {
//		if (session.) {
//			
//		}
		if (session.getAttribute("user_ID").toString().compareTo("USER001")==0 ) {
			roleService.insertRole(role);
			return new ModelAndView("status", "status", "Đã tạo xong");
		}
		
		if (session.getAttribute("user_ID").toString().length()>0) {
			return new ModelAndView("status", "status", "Bạn không có quyền tạo Role, vui lòng liên hệ admin");
		}
		return new ModelAndView("login", "note", "Vui lòng đăng nhập để thực hiện các bước tiếp theo");
	}
}
