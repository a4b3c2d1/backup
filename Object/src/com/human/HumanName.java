package com.human;

public class HumanName {
	public String say;
	private String mei;

	public HumanName() {
		say = "yokota";
		mei = "yudai";
	}

	public HumanName(String say, String mei) {
		this.say=say;
		this.mei=mei;

	}



	public String getname() {
		return say + mei;

	}

	public String getmei() {
		return mei;

	}
}
