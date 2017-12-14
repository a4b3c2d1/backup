/**
 *
 */

/**
 * @author internousdev
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Person taro = new Person();
		taro.name = "taro";
		taro.age = 18;
		System.out.println(taro.name);
		System.out.println(taro.age);

		Person jiro = new Person("jiro", 20);
		System.out.println(jiro.name);
		System.out.println(jiro.age);

		Person saburo = new Person("saburo",20);
		System.out.println(saburo.name);
		System.out.println(saburo.age);

		Person a = new Person(25);
		System.out.println(a.name);
		System.out.println(a.age);

		Person b = new Person(17,"hanako");
		System.out.println(b.name);
		System.out.println(b.age);
		System.out.println(Person.count);


	}

}
