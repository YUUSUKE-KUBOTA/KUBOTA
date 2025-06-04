package jp.co.scsk.kyushu.exBasic;

public class Price {
	private final int FEE = 1000;

	public int praice1(int age) {
		int result = 0;
		double discount = 0;
		if (age < 18) {
			result = FEE / 2;
			if ((age %= 4) == 0) {
				discount = FEE * 0.04;
				result = (int) (FEE * discount);
			}
			if ((age %= 5) == 0) {
				discount = FEE * 0.05;
				result = (int) (FEE * discount);
			}
		} else if (age >= 60) {
			result = FEE - 300;
		} else {
			if ((age %= 4) == 0) {
				discount = FEE * 0.04;
				result = (int) (FEE * discount);
			}
			if ((age %= 5) == 0) {
				discount = FEE * 0.05;
				result = (int) (FEE * discount);
			}
		}
		return result;
	}

	public int praice2(int number, int praice) {
		int result = 0;
		int count = 1;
		for (int i = 0; i <= number; i++) {
			result += praice;
			count++;
			if (count == 5) {
				count = 1;
				result -= praice;
			}
		}
		return result;
	}
}
