package jp.co.scsk.kyushu.repetiton;

public class Repetiton4 {

	public static void main(String[] args) {
		int a = 100;
		int b = 20;
		for(;a >= 0;) {
			a = a - b;
			if (a < 0) {
				System.out.println(b);
			}
			b--;
		}
	}
}
