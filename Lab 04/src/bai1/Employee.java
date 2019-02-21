package bai1;

public class Employee extends Person {
	private double salary;
	public Employee() {
	}
	public Employee(String name, Date birthday) {
		super(name, birthday);
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [" + super.toString() + ", salary=" + salary + "]";
	}
	public Employee(String name, Date birthday, double salary) {
		super(name, birthday);
		this.salary = salary;
	}
	
}
