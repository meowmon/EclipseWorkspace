package bai2;

public class Cow extends Animal {
	@Override
	public void sayHello() {
		System.out.println("Mooo...");
	}
	public void selfIntroduce() {
		System.out.println("My name is " + getName() + ", I am a Cow");
	}
}
