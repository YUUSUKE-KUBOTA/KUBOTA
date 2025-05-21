package jp.co.scsk.kyushu.classAndMethod;

public class ClassAndMethod {

	public static void main(String[] args) {
		Human human1 = new Human();
		human1.printName();
		Human human2 = new Human("田中紋次郎");
		human2.printName();

		Calculation calc = new Calculation();
		System.out.println(calc.plus(2, 3));
		System.out.println(calc.plus(2.0, 3.0));
		System.out.println(calc.multiple(2, 3));
		System.out.println(calc.plus(1, 2, 3));
		System.out.println(calc.plus(1, 2, 3, 4, 5));
		System.out.println(calc.plus(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
	}

}
