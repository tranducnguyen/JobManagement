package my.first.project.dao.impl;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import my.first.project.dao.IJobAssignDao;
import my.first.project.model.Job;
import my.first.project.model.JobAssign;

@Repository
public class JobAssignImpl extends JdbcDaoSupport implements IJobAssignDao {
	@Autowired
	DataSource datasource;

	@PostConstruct
	private void initialize() {
		setDataSource(datasource);
	}

	@Override
	public void insert(JobAssign jobAssign) {
		String sql = "INSERT INTO JOB_ASSIGNED "
				+ "(JOB_ID,USER_ID,PHASE_ID,STATUS_PHASE,HOME_FLAG, DATE_FINISH) VALUES (?, ?, ?,?,?,?)";
		getJdbcTemplate().update(sql, new Object[] { jobAssign.getJob_id(), jobAssign.getUser_ID(),
				jobAssign.getStatus_phase(), jobAssign.getHome_Flag(), jobAssign.getDate_finish() });
	}

	@Override
	public void inserts(List<JobAssign> jobAssigns) {
		// TODO Auto-generated method stub

	}

	@Override
	public Job getJobAssignByName(String job_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(JobAssign jobAssign) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(JobAssign jobAssign) {
		// TODO Auto-generated method stub

	}

}
