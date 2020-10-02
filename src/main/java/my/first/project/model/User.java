package my.first.project.model;

public class User {
	private String user_ID;
	private String user_Password;
	private String user_Name;
	private String cre_date;
	private String cre_user;
	private String upd_date;
	private String upd_user;

	public String getUser_ID() {
		return user_ID;
	}

	public void setUser_ID(String user_ID) {
		if (user_ID.length() <= 12) {
			this.user_ID = user_ID;
		} else {
			this.user_ID = user_ID.substring(0, 11);
		}

	}

	public String getUser_Password() {
		return user_Password;
	}

	public void setUser_Password(String user_Password) {
		if (user_Password.length() <= 32) {
			this.user_Password = user_Password;
		} else {
			this.user_Password = user_Password.substring(0, 31);
		}
	}

	public String getUser_Name() {
		return user_Name;
	}

	public void setUser_Name(String user_Name) {
		this.user_Name = user_Name;
	}

	public String getCre_date() {
		return cre_date;
	}

	public void setCre_date(String cre_date) {
		this.cre_date = cre_date;
	}

	public String getCre_user() {
		return cre_user;
	}

	public void setCre_user(String cre_user) {
		this.cre_user = cre_user;
	}

	public String getUpd_date() {
		return upd_date;
	}

	public void setUpd_date(String upd_date) {
		this.upd_date = upd_date;
	}

	public String getUpd_user() {
		return upd_user;
	}

	public void setUpd_user(String upd_user) {
		this.upd_user = upd_user;
	}

}
