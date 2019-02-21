package bai1;

public class Manager extends Employee {
	private Employee assistant;
	public Manager() {
	}
	public Manager(String name, Date birthday, double salary) {
		super(name, birthday, salary);
	}

	public Manager(String name, Date birthday) {
		super(name, birthday);
	}

	public Employee getAssistant() {
		return assistant;
	}

	public void setAssistant(Employee assistant) {
		this.assistant = assistant;
	}

	@Override
	public String toString() {
		return "Manager ["+super.toString() + ", Assistant=" + super.toString() + "]";
	}
}
