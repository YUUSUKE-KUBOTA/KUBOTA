package jp.co.scsk.kyushu.conditionalBranch;

public class Exercises01 {

	public static void main(String[] args) {
		int hour = 18;
		int mim = 30;
		if (hour >= 12) {
			hour -= 12;
			System.out.println("PM" + hour + ":" + mim);
		} else {
			System.out.println("AM" + hour + ":" + mim);
		}
	}

}
