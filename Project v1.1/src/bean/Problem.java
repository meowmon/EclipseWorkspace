package bean;

public class Problem {

	private String ProblemId;
	private String Username;
	private String Descrips;
	private String status;
	private String id;
	
	public Problem(String problemId, String username, String descrips, String status, String id) {
		super();
		ProblemId = problemId;
		Username = username;
		Descrips = descrips;
		this.status = status;
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getProblemId() {
		return ProblemId;
	}
	public void setProblemId(String problemId) {
		ProblemId = problemId;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getDescrips() {
		return Descrips;
	}
	public void setDescrips(String descrips) {
		Descrips = descrips;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
