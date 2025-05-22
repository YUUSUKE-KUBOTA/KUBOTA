package jp.co.scsk.kyushu.repetiton;

public class Exercises04 {

	public static void main(String[] args) {
		int num = 100;
		int n = 20;
		while (num >= 0) {
			num -= n;
			n--;
		}
		System.out.println(n + 1);
	}
}
