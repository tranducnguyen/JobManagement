package my.first.project.dao;

import java.util.List;

import my.first.project.model.Job;

public interface IJobDao {
	void insertJob(Job job);
	void insertJobs(List<Job> jobs);
	Job getJobByName(String Job_Name);
	void updateJob(Job job);
	void deleteJob(Job job);
}
