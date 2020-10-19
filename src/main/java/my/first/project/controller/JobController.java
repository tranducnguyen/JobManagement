package my.first.project.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import my.first.project.model.Job;
import my.first.project.service.IJobService;

@Controller
public class JobController {
	@Autowired
	IJobService jobservice;


	@RequestMapping(value = "/job-profile", method = RequestMethod.GET)
	public ModelAndView createJobGet (HttpSession session) {
		if (session.getAttribute("userName") != null) {
			ModelAndView model = new ModelAndView("job-profile");
			List<Job> listJob = jobservice.getAllJobs();
			
			model.addObject("job", new Job());
			model.addObject("user_Name", session.getAttribute("userName"));
			model.addObject("jobList", listJob);
			return model;
			
		}
		return new ModelAndView("page-login");

	}

	@RequestMapping(value = "/createjob", method = RequestMethod.POST)
	public ModelAndView createJobPost(@ModelAttribute("job") Job job, HttpSession session) {
		jobservice.insertJob(job);

		ModelAndView model = new ModelAndView("job-profile");
		model.addObject("status", "Đã tạo job mới thành công");
		return model;
	}
	@RequestMapping(value="/editJob/{id}", method = RequestMethod.POST)
	public ModelAndView editJob(@PathVariable("id") String id, HttpSession session) {
		if (session.getAttribute("userName") != null) {
			ModelAndView model = new ModelAndView("job-profile");
			List<Job> listJob = jobservice.getAllJobs();
			Job jobSelect = jobservice.getJobByID(id);
			model.addObject("job", jobSelect);
			model.addObject("user_Name", session.getAttribute("userName"));
			model.addObject("jobList", listJob);
			return model;
			
		}
		return new ModelAndView("page-login");
	}
	
}
