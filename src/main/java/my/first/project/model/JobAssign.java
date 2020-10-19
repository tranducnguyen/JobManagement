package my.first.project.model;

public class JobAssign {
	private String job_id;
	private String user_ID;
	private Integer Phase_ID;
	private String status_phase;
	private String home_Flag;
	private String date_finish;
	public String getJob_id() {
		return job_id;
	}
	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}
	public String getUser_ID() {
		return user_ID;
	}
	public void setUser_ID(String user_ID) {
		this.user_ID = user_ID;
	}
	public Integer getPhase_ID() {
		return Phase_ID;
	}
	public void setPhase_ID(Integer phase_ID) {
		Phase_ID = phase_ID;
	}
	public String getStatus_phase() {
		return status_phase;
	}
	public void setStatus_phase(String status_phase) {
		this.status_phase = status_phase;
	}
	public String getHome_Flag() {
		return home_Flag;
	}
	public void setHome_Flag(String home_Flag) {
		this.home_Flag = home_Flag;
	}
	public String getDate_finish() {
		return date_finish;
	}
	public void setDate_finish(String date_finish) {
		this.date_finish = date_finish;
	}
	
}
