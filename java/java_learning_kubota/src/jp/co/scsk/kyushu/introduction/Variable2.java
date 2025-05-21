package jp.co.scsk.kyushu.introduction;

public class Variable2 {

	public static void main(String[] args) {
		Sex a = new Sex(Sex.MAN);
		Sex b = new Sex(Sex.WOMAN);

		System.out.println("-- display1 --");
		System.out.println("a = " + a.getSex());
		System.out.println("b = " + b.getSex());

		a = b;

		System.out.println("-- display2 --");
		System.out.println("a = " + a.getSex());
		System.out.println("b = " + b.getSex());

		b.setSex(Sex.MAN);

		System.out.println("-- display3 --");
		System.out.println("a = " + a.getSex());
		System.out.println("b = " + b.getSex());
	}

}
