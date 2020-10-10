package my.first.project.service;

import java.util.List;

import my.first.project.model.Job;
import my.first.project.model.User;

public interface IJobService {
	void insertJob(Job job);
	void updateJob(Job job);
	void deleteJob(Job job);
	List<Job> getJobsByUser(User user);
	void assignRoleByUser ();
	void insertListJobs(List<Job> jobs);
}
