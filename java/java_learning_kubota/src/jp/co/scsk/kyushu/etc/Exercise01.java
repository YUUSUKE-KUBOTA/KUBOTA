package jp.co.scsk.kyushu.etc;

public class Exercise01 {

	public static double getValue(int age) {
		double fee = 1000;
		if (age < 6 || age > 100) {
			fee = 0;
		} else if (age > 60) {
			fee = fee - (fee * (100 - age) / 100d);
		} else if (age % 5 == 0) {
			fee = fee - (fee * 0.05);
		} else if (age % 3 == 0) {
			fee = fee - (fee * 0.03);
		} else if (age % 5 == 0 && age % 3 == 0) {
			fee = fee - (fee * 0.1);
		} else if (age < 20) {
			fee = 800;
		}
		return fee;
	}
}
