package bean;

public class Disease {
	private String name;
	private int id;
	private String diseaseTypeId;
	private String status;
	private String descrip;
	private String diseaseId;
	
	public Disease() {
		super();
	}
	
	public Disease(String name, int id, String diseaseTypeId, String status, String descrip, String diseaseId) {
		super();
		this.name = name;
		this.id = id;
		this.diseaseTypeId = diseaseTypeId;
		this.status = status;
		this.descrip = descrip;
		this.diseaseId = diseaseId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id2) {
		this.id = id2;
	}

	public String getDiseaseTypeId() {
		return diseaseTypeId;
	}

	public void setDiseaseTypeId(String diseaseTypeId) {
		this.diseaseTypeId = diseaseTypeId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDescrip() {
		return descrip;
	}

	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}

	public String getDiseaseId() {
		return diseaseId;
	}

	public void setDiseaseId(String diseaseId) {
		this.diseaseId = diseaseId;
	}
	
	
}
