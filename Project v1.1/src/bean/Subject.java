package bean;	

public class Subject {
	private int id;
	private String name;
	private String subId;
	private String idKhoa;
	private String khoa;
	private String status;
	public Subject() {
		
	}
	
	public Subject(int gid, String id, String idKhoa, String status, String status2) {
		super();
		this.id = gid;
		this.subId = id;
		this.name = name;
		this.idKhoa = idKhoa;
		setStatus(status); 
	}

	public Subject(String name, String depId, String status) {
		this.name = name;
		this.idKhoa = depId;
		this.status = status;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
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

	public String getSubId() {
		return subId;
	}

	public void setSubId(String subId) {
		this.subId = subId;
	}

	public String getKhoa() {
		return khoa;
	}

	public void setKhoa(String khoa) {
		this.khoa = khoa;
	}
}
