package jp.co.scsk.kyushu.exBasic;

public class Price {

	public int praice1(int age) {
		int fee = 1000;
		double discount;
		if (age < 7) {
			fee = 0;
		} else if (age < 18) {
			fee /= 2;
			if ((age %= 4) == 0) {
				discount = fee * 0.04;
				fee -= (int) discount;
			}
			if ((age %= 5) == 0) {
				discount = fee * 0.05;
				fee -= (int) discount;
			}
		} else if (age >= 60) {
			fee -= 300;
		} else {
			if ((age %= 4) == 0) {
				discount = fee * 0.04;
				fee -= (int) discount;
			}
			if ((age %= 5) == 0) {
				discount = fee * 0.05;
				fee -= (int) discount;
			}
		}
		return fee;
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
