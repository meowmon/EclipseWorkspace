package bean;

public class DiseaseType {
	private String name;
	private int id;
	private String DiseaseTypeId;
	private String Status;
	private String Descrip;
	public DiseaseType() {
		super();
	}
	
	public DiseaseType(String name, int id, String diseaseTypeId, String status) {
		super();
		this.name = name;
		this.id = id;
		DiseaseTypeId = diseaseTypeId;
		Status = status;
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
		return DiseaseTypeId;
	}
	public void setDiseaseTypeId(String diseaseTypeId) {
		DiseaseTypeId = diseaseTypeId;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}

	public String getDescrip() {
		return Descrip;
	}

	public void setDescrip(String descrip) {
		Descrip = descrip;
	}
	
}
