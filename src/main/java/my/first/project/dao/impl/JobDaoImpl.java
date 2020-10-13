package my.first.project.dao.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import my.first.project.dao.IJobDao;
import my.first.project.model.Job;

@Repository
public class JobDaoImpl extends JdbcDaoSupport implements IJobDao{
	@Autowired
	DataSource datasource;
	
	@PostConstruct
	private void initialize() {
		setDataSource(datasource);
	}
	
	@Override
	public void insertJob(Job job) {
		String jobID = createJobID();
		String sql = "INSERT INTO JOBS " + "(JOB_ID,JOB_NM,JOB_DS,JOB_DT) VALUES (?, ?, ?,?)";
		getJdbcTemplate().update(sql, new Object[] { jobID, job.getJob_nm(), job.getJob_ds(),job.getJob_dt() });
		// TODO Auto-generated method stub
		
	}
	private String createJobID() {
		String sql ="SELECT COUNT(USER_ID)+1 AS SL FROM USERS";
		String so;
		String kq="";
		List<Map<String, Object>> sl = getJdbcTemplate().queryForList(sql);
		for (Map<String, Object> map : sl) {
			so = map.get("SL").toString();
			kq ="JOB"+ "000".substring(0, 3-so.length())+so;
			break;
		}

		return kq;
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
