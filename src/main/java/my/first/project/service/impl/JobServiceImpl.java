package my.first.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.first.project.dao.IJobDao;
import my.first.project.model.Job;
import my.first.project.model.User;
import my.first.project.service.IJobService;

@Service
public class JobServiceImpl implements IJobService{
	@Autowired
	IJobDao jobDao;
	
	@Override
	public void insertJob(Job job) {
		// TODO Auto-generated method stub
		jobDao.insertJob(job);
	}

	@Override
	public void updateJob(Job job) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteJob(Job job) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Job> getJobsByUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void assignRoleByUser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertListJobs(List<Job> jobs) {
		// TODO Auto-generated method stub
		
	}

}
