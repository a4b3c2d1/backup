public class HumanTest{
	public static void main(String[] args){
		Human human = new Human();
                Human human2 = new Human("タカシ", 19801231);
                Human human3 = new Human();

                System.out.println("名前：" + human.name);
                System.out.println("生年月日：" + human.birthday);
                System.out.println("満腹度：" + human.manpukudo);
                System.out.println("");

                System.out.println("名前：" + human2.name);
                System.out.println("生年月日：" + human2.birthday);
                System.out.println("満腹度：" + human2.manpukudo);
                System.out.println("");

                System.out.println("名前：" + human3.name);
                System.out.println("生年月日：" + human3.birthday);
                System.out.println("満腹度：" + human3.manpukudo);
                System.out.println(human3.count_Human);
	}
}