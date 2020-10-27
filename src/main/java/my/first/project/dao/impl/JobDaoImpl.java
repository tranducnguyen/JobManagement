package my.first.project.dao.impl;


import java.util.ArrayList;
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
public class JobDaoImpl extends JdbcDaoSupport implements IJobDao {
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
		getJdbcTemplate().update(sql, new Object[] { jobID, job.getJob_nm(), job.getJob_ds(), job.getJob_dt() });
	}

	private String createJobID() {
		String sql = "SELECT COUNT(JOB_ID)+1 AS SL FROM JOBS";
		String so;
		String kq = "";
		List<Map<String, Object>> sl = getJdbcTemplate().queryForList(sql);
		for (Map<String, Object> map : sl) {
			so = map.get("SL").toString();
			kq = "JOB" + "000".substring(0, 3 - so.length()) + so;
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

	@Override
	public List<Job> getAllJobs() {
		String sql = "SELECT * FROM JOBS WHERE STATUS <> 'JOB001-FINISH'";
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);

		if (rows.size() > 0) {
			List<Job> result = new ArrayList<Job>();
			for (Map<String, Object> row : rows) {
				Job job = new Job();
				job.setJob_id((String) row.get("JOB_ID"));
				job.setJob_nm((String) row.get("JOB_NM"));
				job.setJob_ds((String) row.get("JOB_DS"));
				job.setJob_dt((String) row.get("JOB_DT"));
				job.setNo_phase((Integer) row.get("NO_PHASE"));
				job.setJob_status((String) row.get("STATUS"));
				result.add(job);

			}
			return result;
		}
		return null;
	}

	@Override
	public Job getJobByID(String job_ID) {
		String sql = "SELECT * FROM JOBS WHERE JOB_ID ='" + job_ID + "'";
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
		if (rows.size() > 0) {
			for (Map<String, Object> row : rows) {
				Job job = new Job();
				job.setJob_id((String) row.get("JOB_ID"));
				job.setJob_nm((String) row.get("JOB_NM"));
				job.setJob_ds((String) row.get("JOB_DS"));
				job.setJob_dt((String) row.get("JOB_DT"));
				job.setNo_phase((Integer) row.get("NO_PHASE"));
				job.setJob_status((String) row.get("STATUS"));
				return job;
			}
		}
		return null;

//		return (Job) getJdbcTemplate().queryForObject(sql, new Object[] { job_ID }, new RowMapper<Job>() {
//			@Override
//			public Job mapRow(ResultSet rs, int rwNmber) throws SQLException {
//				Job job = new Job();
//				job.setJob_id(rs.getString("JOB_ID"));
//				job.setJob_nm(rs.getString("JOB_NM"));
//				job.setJob_ds(rs.getString("JOB_DS"));
//				job.setJob_dt(rs.getString("JOB_DT"));
//				job.setNo_phase(rs.getInt("NO_PHASE"));
//				job.setJob_status(rs.getString("STATUS"));
//				return job;
//			}
//		});
	}
}
