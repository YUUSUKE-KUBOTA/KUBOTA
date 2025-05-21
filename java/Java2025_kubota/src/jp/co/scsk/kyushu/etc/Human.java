package jp.co.scsk.kyushu.etc;

public class Human {
	private String name;
	private int age;

	Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}
