package p17;

public class UserInfo {
	private Integer userno;
	private String username;
	private Integer userage;
	private String userid;
	private String userpwd;
	public Integer getUserno() {
		return userno;
	}
	public void setUserno(Integer userno) {
		this.userno = userno;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getUserage() {
		return userage;
	}
	public void setUserage(Integer userage) {
		this.userage = userage;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpwd() {
		return userpwd;
	}
	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}
	@Override
	public String toString() {
		return "UserInfo [userno=" + userno + ", username=" + username + ", userage=" + userage + ", userid=" + userid
				+ ", userpwd=" + userpwd + "]";
	}
	
}
