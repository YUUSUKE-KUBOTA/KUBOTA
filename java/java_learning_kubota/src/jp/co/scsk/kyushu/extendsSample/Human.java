package jp.co.scsk.kyushu.extendsSample;

import java.util.Date;

public class Human {
	private String name;
	private int sex;
	private Date birthday;

	public void walk() {}
	public void unr() {}
	public void eat(Food food) {
		System.out.println("家族団らんで円卓を囲んでご飯を食べる");
	}
	public void sleep() {}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
}
