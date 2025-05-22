package jp.co.scsk.kyushu.repetiton;

public class Exercises02 {

	public static void main(String[] args) {
		int result = 1;
		int base = 2;
		int exponent = 7;
		int i = 0;
		while (i < exponent) {
			result *= base;
			i++;
		}
		System.out.println(result);
	}

}
