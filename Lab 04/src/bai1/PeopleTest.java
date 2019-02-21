package bai1;

public class PeopleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1.a___________________________________________________");
		Employee newbie = new Employee("Newbie", new Date(10,2,1989), 1000000);
		Manager boss = new Manager("Boss", new Date(23,2,1979), 4000000);
		boss.setAssistant(newbie);
		Manager bigBoss = new Manager("Big Boss", new Date(3,12,1969), 10000000);
		bigBoss.setAssistant(boss);
		System.out.println(newbie.toString());
		System.out.println(boss.toString());
		System.out.println(bigBoss.toString());
		System.out.println("1.b___________________________________________________");
		Person[] person = new Person[50];
		person[0] = new Employee();
		person[0] = newbie;
		person[1] = new Manager();
		person[1] = boss;
		person[2] = new Manager();
		person[2] = bigBoss;
		for(Person sample: person ) {
			sample.toString();
		}
	}

}
