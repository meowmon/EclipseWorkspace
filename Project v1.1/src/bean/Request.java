package bean;

public class Request {
	private int id;
	private String requestId;
	private String descrip;
	private String problemId;
	private String date;
	private String time;
	private String dial;
	private String username;
	private String userId;
	private String status;
	public Request() {
		super();
	}
	public Request(int id, String requestId, String descript, String problemId, String userId, String status) {
		super();
		this.id = id;
		this.requestId = requestId;
		this.descrip = descript;
		this.problemId = problemId;
		this.userId = userId;
		this.status = status;
	}
	public Request(String userId, String time, String date) {
		this.userId = userId;
		this.date = date;
		this.time = time;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRequestId() {
		return requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getDescrip() {
		return descrip;
	}
	public void setDescrip(String descript) {
		this.descrip = descript;
	}
	public String getProblemId() {
		return problemId;
	}
	public void setProblemId(String problemId) {
		this.problemId = problemId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getDial() {
		return dial;
	}
	public void setDial(String dial) {
		this.dial = dial;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	

}
