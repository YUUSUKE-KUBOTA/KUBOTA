package jp.co.scsk.kyushu.classAndMethod;

public class Human {
	private String name = "";

	Human() {

	}

	Human(String name) {
		this.name = name;
	}

	public void printName() {
		if (name.length() > 0) {
			System.out.println(name);
		} else {
			System.out.println("noname");
		}
	}
}
