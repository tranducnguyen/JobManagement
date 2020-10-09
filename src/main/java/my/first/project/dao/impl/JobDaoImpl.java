package my.first.project.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import my.first.project.dao.IJobDao;
import my.first.project.model.Job;

@Repository
public class JobDaoImpl extends JdbcDaoSupport implements IJobDao{

	@Override
	public void insertJob(Job job) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertJobs(List<Job> jobs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Job getJobByName(String Job_Name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateJob(Job job) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteJob(Job job) {
		// TODO Auto-generated method stub
		
	}


	

}
