package jp.co.scsk.kyushu.conditionalBranch;

public class Exercises03 {
	
	public static void main(String[] args) {
		int age = 30;
		String sex = "男性";
		int fee;
		if (age >= 0 && age <=2) {
			fee = 0;
		} else if (age >= 3 && age <=12) {
			if (sex.equals("男性")) {
				fee = 4500;
			} else {
				fee = 3500;
			}
		} else {
			if (sex.equals("男性")) {
				fee = 9000;
			} else {
				fee = 7000;
			}
		}
		System.out.println("宿泊料金は" + fee + "円です");
	}
}
