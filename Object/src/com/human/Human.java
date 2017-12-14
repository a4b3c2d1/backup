package com.human;

public class Human {
	public static String say;
	public static String mei;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("helloworld");

		say = "yokota";
		mei = "yudai";
		System.out.println(say + mei);

		HumanName humanName = new HumanName();
		System.out.println(humanName.getname());
		String say1 = humanName.say;
		String mei = humanName.getmei();
		System.out.println(say1+mei);




	    HumanName humanName1 = new HumanName("tanaka","aaaaaaaa");
	    System.out.println(humanName1.getname());
}
}
