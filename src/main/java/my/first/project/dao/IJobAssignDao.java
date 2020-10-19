package my.first.project.dao;

import java.util.List;

import my.first.project.model.Job;
import my.first.project.model.JobAssign;

public interface IJobAssignDao {
	void insert(JobAssign jobAssign);
	void inserts(List<JobAssign> jobAssigns);
	Job getJobAssignByName(String job_id);
	void update(JobAssign jobAssign);
	void delete(JobAssign jobAssign);
}
