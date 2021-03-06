package bean;

public class ExamDetail {
	private int leftEye;
	private int rightEye;
	private int height;
	private int weight;
	private double BMI;
	private int beat;
	private int pressure;
	private String pclass;
	private String status;
	private String idHoSo;
	public int getLeftEye() {
		return leftEye;
	}
	public void setLeftEye(int leftEye) {
		this.leftEye = leftEye;
	}
	public int getRightEye() {
		return rightEye;
	}
	public void setRightEye(int rightEye) {
		this.rightEye = rightEye;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getBeat() {
		return beat;
	}
	public void setBeat(int beat) {
		this.beat = beat;
	}
	public int getPressure() {
		return pressure;
	}
	public void setPressure(int pressure) {
		this.pressure = pressure;
	}
	public String getPclass() {
		return pclass;
	}
	public void setPclass(String pclass) {
		this.pclass = pclass;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getBMI() {
		return BMI;
	}
	public void setBMI() {
		BMI = (double)Math.round(((double)this.weight*10000)/((double)this.height*(double)this.height)*100)/100;
	}
	public String getIdHoSo() {
		return idHoSo;
	}
	public void setIdHoSo(String idHoSo) {
		this.idHoSo = idHoSo;
	}
	
}
