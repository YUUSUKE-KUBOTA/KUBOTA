package jp.co.scsk.kyushu.conditionalBranch;

public class Exercises02 {
	//private static final int ADULT_PRAICE;
	
	public static void main(String[] args) {
		int age = 10;
		int fee;
		if (age <= 2) {
			fee = 0;
		} else if (age <= 12) {
			fee = 4000;
		} else {
			fee = 8000;
		}
		System.out.println("宿泊料金は" + fee + "円です");
	}
}
