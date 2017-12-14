package kougi1;

public class Person {
	public String name = null;
	public int age = 0;

	public Person() {
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Person(String name) {
		this(name,0);
	}

	public Person(int age) {
		this("名前なし",age);
	}

	public Person(int age, String name) {
		this(name,age);
	}
}