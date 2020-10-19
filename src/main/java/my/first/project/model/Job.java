package my.first.project.model;

public class Job {
	// ID
	private String job_id;
	// Name
	private String job_nm;
	// Mô tả
	private String job_ds;
	// Chi tiết làm gì
	private String job_dt;
	
	private String job_status;

	private Integer no_phase;

	public String getJob_id() {
		return job_id;
	}

	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}

	public String getJob_nm() {
		return job_nm;
	}

	public void setJob_nm(String job_nm) {
		this.job_nm = job_nm;
	}

	public String getJob_ds() {
		return job_ds;
	}

	public void setJob_ds(String job_ds) {
		this.job_ds = job_ds;
	}

	public String getJob_dt() {
		return job_dt;
	}

	public void setJob_dt(String job_dt) {
		this.job_dt = job_dt;
	}

	public Integer getNo_phase() {
		return no_phase;
	}

	public void setNo_phase(Integer no_phase) {
		this.no_phase = no_phase;
	}

	public String getJob_status() {
		return job_status;
	}

	public void setJob_status(String job_status) {
		this.job_status = job_status;
	}

}
