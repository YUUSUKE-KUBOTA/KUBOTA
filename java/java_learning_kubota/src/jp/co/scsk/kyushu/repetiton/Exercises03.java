package jp.co.scsk.kyushu.repetiton;

public class Exercises03 {
	public static void main(String[] args) {
		int base = 2;
		int result = 1;
		int expornent = 7;
		int i = 0;
		do {
			result *= base;
			i++;
		} while (i < expornent);
		System.out.println(result);
	}

}
