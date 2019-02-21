package bean;

public class Examination {
	private String id;
	private String name;
	private String date;
	private String placce;
	private String status;

	public Examination() {
		// TODO Auto-generated constructor stub
	}
	
	public Examination(String id2, String name2, String status2) {
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getPlacce() {
		return placce;
	}
	public void setPlacce(String placce) {
		this.placce = placce;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
