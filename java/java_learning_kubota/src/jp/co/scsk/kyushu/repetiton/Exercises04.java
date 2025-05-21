package jp.co.scsk.kyushu.repetiton;

public class Exercises04 {
	
	public static void main(String[] args) {
		int x = 100;
		int y = 20;
		int n;
		while (x >= 0) {
			x -= y;
			y--;
		}
		n = y + 1;
		System.out.println("100 - 20 - 19 - 18 - ... - " + n + " < 0");
	}
	
}
