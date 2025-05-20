package jp.co.scsk.kyushu.classAndMethod;

public class Calculation {
	public int plus(int num1, int num2) {
		System.out.println("intの計算です");
		return num1 + num2;
	}

	public double plus(double num1, double num2) {
		System.out.println("doubleの計算です");
		return num1 + num2;
	}

	public int plus(int... nums) {
		System.out.println("可変長引数の合計値です");
		int sum = 0;
		for (int num : nums) {
			sum += num;
		}
		return sum;
	}

	public int multiple(int num1, int num2) {
		int res = 0;
		for (int i = 0; i < num2; i++) {
			res = plus(res, num1);
		}
		return res;
	}
}
