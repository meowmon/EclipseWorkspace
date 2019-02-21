package bean;	

public class Subject {
	private String id;
	private String name;
	private String idKhoa;
	private String status;
	public Subject() {
		
	}
	
	public Subject(String id, String name, String idKhoa, String status) {
		super();
		this.id = id;
		this.name = name;
		this.idKhoa = idKhoa;
		setStatus(status); 
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
	public String getIdKhoa() {
		return idKhoa;
	}
	public void setIdKhoa(String idKhoa) {
		this.idKhoa = idKhoa;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
//		if(Integer.parseInt(status) == 1)
//			this.status = "Bình thường";
//		else
//			this.status = "Không hoạt động";
	}
}
