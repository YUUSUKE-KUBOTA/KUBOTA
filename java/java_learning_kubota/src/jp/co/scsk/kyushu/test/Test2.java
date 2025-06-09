package jp.co.scsk.kyushu.test;

public class Test2 {

	private final int OLDFEE = 1000;
	private final int YANGFEE = 800;

	public static void main(String[] args) throws Exception {
		
		System.out.println("C0");
		check(-1);
		check(60);
		check(15);
		check(10);
		check(9);
		System.out.println("C1");
		check(-1);
		check(22);
		check(60);
		check(15);
		check(10);
		check(9);
		check(3);
		System.out.println("C2");
		check(22);
		System.out.println("MCC");
		check(-1);
		check(100);
		check(60);
		check(30);
		check(25);
		check(24);
		check(22);
		check(15);
		check(10);
		check(9);
		check(8);
		check(3);
		System.out.println("ブラックボックステスト");
		check(null);
		check("a");
		check(-1);
		check(0);
		check(5);
		check(6);
		check(10);
		check(15);
		check(19);
		check(20);
		check(21);
		check(30);
		check(59);
		check(60);
		check(99);
		check(100);
	}

	public static void check(Object ageObj) {
		Test2 test2 = new Test2();
		int fee = 0;
		int discount = 0;

		try {
			int age = ((int) ageObj);
		} catch (Exception e) {
			System.out.println("正しい年齢を入力してください");
			return;
		}

		int age = ((int) ageObj);

		try {
			validateAge(age);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return;
		}

		if (age >= 0) {
			if (age >= 20) {
				fee = test2.OLDFEE;
			} else {
				fee = test2.YANGFEE;
			}
			if (age >= 60) {
				discount = age;
			} else if ((age % 15) == 0) {
				discount = 10;
			} else if ((age % 5) == 0) {
				discount = 5;
			} else if ((age % 3) == 0) {
				discount = 3;
			}
			if (age < 6 || age >= 100) {
				discount = 100;
			}
			fee -= fee * ((double) discount / 100);
			System.out.println(fee + "円");
		}
	}

	public static void validateAge(int age) throws Exception {
		if (age < 0) {
			System.out.println("正しい年齢を入力してください");
		}
	}
}
