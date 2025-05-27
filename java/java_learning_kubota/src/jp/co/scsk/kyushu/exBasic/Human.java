package jp.co.scsk.kyushu.exBasic;

public class Human {

	private int age;
	private String name;
	private Sex sex;
	private Blood blood;
	private double height;
	private double weight;

	public int getAge() {
		return this.age;
	}

	public String getName() {
		return this.name;
	}

	public Sex getSex() {
		return this.sex;
	}

	public Blood getBlood() {
		return this.blood;
	}

	public double getHeight() {
		return this.height;
	}

	public double getWeight() {
		return this.weight;
	}

	public void getAge(int age) {
		this.age = age;
	}

	public void getName(String name) {
		this.name = name;
	}

	public void getSex(Sex sex) {
		this.sex = sex;
	}

	public void getBlood(Blood blood) {
		this.blood = blood;
	}

	public void getHeight(double height) {
		this.height = height;
	}

	public void getWeight(double weight) {
		this.weight = weight;
	}

	Human(int age, String name, Sex sex, Blood blood, double height, double weight) {
		this.age = age;
		this.name = name;
		this.sex = sex;
		this.blood = blood;
		this.height = height;
		this.weight = weight;
	}

	public void speak() {
		System.out.println("・・・");
	}

	public void speak(String speak) {
		System.out.println(speak);
	}

	public void speak(String speak, int count) {
		for (int i = 0; i <= count; i++) {
			System.out.println(speak);
		}
	}
}
