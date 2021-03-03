package objects;

class Person {
	String name;
	int age;
	double height;
	double weight;

	Person() {

	}

	Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	void introduce() {
		System.out.println("�̸��� " + this.name + " ���̴� " + this.age + "�Դϴ�.");

	}
}

public class PersonExample {
	public static void main(String[] args) {
		// ���ڿ�:�̸�, ����:���� int[], String[]
		// Person[] : String, int
		new Person();
		Person[] persons = new Person[5];
		persons[0] = new Person("ȫ�浿", 15, 175.5, 72.5);
		persons[1] = new Person("��浿", 25, 125.5, 32.5);
		persons[2] = new Person("�̱浿", 22, 185.5, 82.5);
		persons[3] = new Person("�ڱ浿", 19, 145.5, 42.5);
		persons[4] = new Person("�ֱ浿", 35, 185.5, 82.5);
		for (Person person : persons) {
			if (person.age > 20 && person.height > 180) {
				person.introduce();
			}
		}
	}

}
