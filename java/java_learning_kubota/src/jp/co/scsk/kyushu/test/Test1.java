package jp.co.scsk.kyushu.test;

public class Test1 {

	private final int MANFEE = 8000;
	private final int WOMANFEE = 6000;

	public static void main(String[] args) throws Exception {
		Sex sex1 = new Sex(1);
		Sex sex2 = new Sex(2);
		System.out.println("C0");
		check(null, null);
		check(sex1, 0);
		check(sex2, 11);
		check(sex2, -1);
		System.out.println("C1");
		check(null, 0);
		check(sex1, 0);
		check(sex2, -1);
		check(sex1, 11);
		check(sex1, 16);
		System.out.println("C2");
		check(sex2, 13);
		System.out.println("MCC");
		check(null, null);
		check("man", null);
		check(sex1, "1歳");
		check(sex1, -1);
		check(sex1, 0);
		check(sex1, 11);
		check(sex1, 16);
		check(sex2, "1歳");
		check(sex2, -1);
		check(sex2, 0);
		check(sex2, 11);
		check(sex2, 16);
		System.out.println("ブラックボックステスト");
		check(null, -1);
		check(null, 0);
		check(null, 2);
		check(null, 3);
		check(null, 12);
		check(null, 13);
		check(sex1, -1);
		check(sex1, 0);
		check(sex1, 2);
		check(sex1, 3);
		check(sex1, 12);
		check(sex1, 13);
		check(sex2, -1);
		check(sex2, 0);
		check(sex2, 2);
		check(sex2, 3);
		check(sex2, 12);
		check(sex2, 13);
		check("男性", -1);
		check("男性", 0);
		check("男性", 2);
		check("男性", 3);
		check("男性", 12);
		check("男性", 13);
		check(1, -1);
		check(1, 0);
		check(1, 2);
		check(1, 3);
		check(1, 12);
		check(1, 13);
	}

	public static void check(Object sexObj, Object ageObj) throws Exception {
		Test1 test1 = new Test1();
		int fee = 0;

		try {
			NullCheckSex(sexObj);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return;
		}

		try {
			Sex sex = ((Sex) sexObj);
		} catch (Exception e) {
			System.out.println("sexを正しく入力してください");
			return;
		}

		try {
			int age = ((int) ageObj);
		} catch (Exception e) {
			System.out.println("ageを正しく入力してください");
			return;
		}

		Sex sex = ((Sex) sexObj);
		int age = ((int) ageObj);

		try {
			validateAge(age);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return;
		}

		if (sex.isMan()) {
			fee = test1.MANFEE;
		} else if (sex.isWoman()) {
			fee = test1.WOMANFEE;
		}

		if (age >= 0) {
			if (age <= 2) {
				fee = 0;
			} else if (age <= 12) {
				fee /= 2;
			}
		}
		System.out.println(fee + "円");
	}

	public static void validateAge(int age) throws Exception {
		if (age < 0) {
			throw new Exception("ageを正しく入力してください");
		}
	}

	public static void NullCheckSex(Object sexObj) throws Exception {
		if (sexObj == null) {
			throw new Exception("sexを正しく入力してください");
		}
	}
}
