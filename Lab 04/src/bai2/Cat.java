package bai2;

public class Cat extends Animal {
	@Override
	public void sayHello() {
		System.out.println("Meow...");
	}
	public void selfIntroduce() {
		System.out.println("My name is " + getName() + ", I am a cat");
	}
	
}
