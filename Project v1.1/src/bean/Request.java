package bean;

public class Request {
	private String id;
	private String requestId;
	private String descrip;
	private String problemId;
	private String userId;
	private String status;
	public Request() {
		super();
	}
	public Request(String id, String requestId, String descript, String problemId, String userId, String status) {
		super();
		this.id = id;
		this.requestId = requestId;
		this.descrip = descript;
		this.problemId = problemId;
		this.userId = userId;
		this.status = status;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
	

}
