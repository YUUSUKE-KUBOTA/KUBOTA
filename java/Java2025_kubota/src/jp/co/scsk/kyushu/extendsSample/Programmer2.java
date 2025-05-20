package jp.co.scsk.kyushu.extendsSample;

import java.util.Date;

public class Programmer2 {
	private String name;
	private int sex;
	private Date birthday;
	private String pgLanguage;

	public void walk() {}
	public void unr() {}
	public void eat(Food food) {}
	public void sleep() {}
	public void programing() {}

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
	public String getPgLanguage() {
		return pgLanguage;
	}
	public void setPgLanguage(String pgLanguage) {
		this.pgLanguage = pgLanguage;
	}
}
