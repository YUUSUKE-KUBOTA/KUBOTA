package jp.co.scsk.kyushu.extendsSample;

public class ExtendsSample {

	public static void main(String[] args) {
		Programmer pg1 = new Programmer();
		pg1.setName("山田太郎");
		pg1.setPgLanguage("Java");
		System.out.println(pg1.getName() + "さんは" + pg1.getPgLanguage() + "を使うことができます");
		pg1.eat(new Food());

		Programmer2 pg2 = new Programmer2();
		pg2.setName("鈴木花子");
		pg2.setPgLanguage("C#");
		System.out.println(pg2.getName() + "さんは" + pg2.getPgLanguage() + "を使うことができます");
	}

}
