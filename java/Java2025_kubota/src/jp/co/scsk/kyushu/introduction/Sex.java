package jp.co.scsk.kyushu.introduction;

public class Sex {
	public static final int MAN = 1;
	public static final int WOMAN = 2;

	private int sex;

	public Sex(int sex) {
		this.sex = sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getSex() {
		return sex == MAN ? "MAN" : "WOMAN";
	}
}
