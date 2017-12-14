
public class a1 {

	int num;
	double gas;

	void show()
	{
		System.out.println(num+"です。");
		num =300;
	}

}



class sample2{
	public static void main(String [] args)
	{
		a1 car1 = new a1();

		car1.num =212;

		car1.show();
		car1.show();
	}
}
