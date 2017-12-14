public class Human {
	int count_Human =0;
	String name; // メンバ1
	int birthday; // メンバ2
	int manpukudo; // メンバ3

	Human(String name, int birthday, int manpukudo) { // コンストラクタ1
		this.name = name;
		this.birthday = birthday;
		this.manpukudo = manpukudo;

	}

	Human(String name, int birthday) { // コンストラクタ2
		this(name, birthday, 50);
	}

	Human(String name) {
		this(name, 0, 50); // コンストラクタ3
	}

	Human() { // コンストラクタ4
		this("不明", 0, 50);
		count_Human++;
	}

	void eat() {// メンバ4
		this.manpukudo += 60;

	}
}