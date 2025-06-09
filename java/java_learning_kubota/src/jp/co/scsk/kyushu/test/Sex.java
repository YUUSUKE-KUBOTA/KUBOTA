package jp.co.scsk.kyushu.test;

public class Sex {
	private int sex;
	public static final int MAN = 1;
	public static final int WOMAN = 2;

	public Sex(int sex) {
		this.sex = sex;
	}

	public boolean isMan() {
		return this.sex == MAN;
	}

	public boolean isWoman() {
		return this.sex == WOMAN;
	}
}
