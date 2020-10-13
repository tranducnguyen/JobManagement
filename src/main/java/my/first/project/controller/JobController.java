package my.first.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import my.first.project.model.Job;
import my.first.project.service.IJobService;

@Controller
public class JobController {
	@Autowired
	IJobService jobservice; 
	
	@RequestMapping(value="/createjob", method = RequestMethod.GET)
	public ModelAndView createJobGet () {
		return new ModelAndView("jobs", "job", new Job());
	}
	
	@RequestMapping(value="/createjob", method = RequestMethod.POST)
	public ModelAndView createJobPost (@ModelAttribute("job") Job job) {
		jobservice.insertJob(job);
		ModelAndView model = new ModelAndView("status");
		model.addObject("status", "Đã tạo job mới");
		return model;
	}
}
