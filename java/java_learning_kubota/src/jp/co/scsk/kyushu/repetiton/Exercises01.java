package jp.co.scsk.kyushu.repetiton;

public class Exercises01 {

	public static void main(String[] args) {
		int result = 1;
		int base = 2;
		int exponent = 7;
		for (int i = 0; i < exponent; i++) {
			result *= base;
		}
		System.out.println(result);
	}
}
