package jp.co.scsk.kyushu.extendsSample;

public class Programmer extends Human {
	private String pgLanguage;

	public void programing() {}

	@Override
	public void eat(Food food) {
		super.eat(food);
		System.out.println("PCに向かって仕事をしながらご飯を食べる");
	}

	public String getPgLanguage() {
		return pgLanguage;
	}

	public void setPgLanguage(String pgLanguage) {
		this.pgLanguage = pgLanguage;
	}
}
