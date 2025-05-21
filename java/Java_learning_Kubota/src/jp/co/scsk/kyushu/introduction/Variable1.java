package jp.co.scsk.kyushu.introduction;

public class Variable1 {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;

		System.out.println("-- display1 --");
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		a = b;

		System.out.println("-- display2 --");
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		b = 3;

		System.out.println("-- display3 --");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

}
