package jp.co.scsk.kyushu.conditionalBranch;

public class Exercises02 {
	
	public static void main(String[] args) {
		int age = 10;
		int fee;
		if (age >= 0 || age <=2) {
			fee = 0;
		} else if (age >= 3 && age <=12) {
			fee = 4000;
		} else {
			fee = 8000;
		}
		System.out.println("宿泊料金は" + fee + "円です");
	}
}
