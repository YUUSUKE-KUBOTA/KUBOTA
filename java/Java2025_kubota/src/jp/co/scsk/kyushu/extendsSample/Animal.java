package jp.co.scsk.kyushu.extendsSample;

public abstract class Animal {
	private int age;
	private double height;
	private double weight;
	private String sex;

	public abstract void cry();

	public void eat() {
		System.out.println("動物は食事をします");
	}

	public void run() {
		System.out.println("動物は走ることができます");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
}
