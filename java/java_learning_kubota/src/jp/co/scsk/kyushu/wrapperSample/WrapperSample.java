package jp.co.scsk.kyushu.wrapperSample;

public class WrapperSample {

	public static void main(String[] args) {
		autoBoxing();
		unBoxing();
	}

	private static void autoBoxing() {
		System.out.println("-- オートボクシング -----");
		int intNum = 10;
		Integer integerNum1 = new Integer(intNum);
		Integer integerNum2 = Integer.valueOf(intNum);
		Integer integerNum3 = intNum;
		System.out.println(intNum);
		System.out.println(integerNum1.toString());
		System.out.println(integerNum2.toString());
		System.out.println(integerNum3.toString());
	}

	private static void unBoxing() {
		System.out.println("-- アンボクシング -------");
		Integer integerNum = new Integer(10);
		int intNum1 = integerNum.intValue();
		int intNum2 = (int)integerNum;
		int intNum3 = integerNum;
		System.out.println(integerNum.toString());
		System.out.println(intNum1);
		System.out.println(intNum2);
		System.out.println(intNum3);
	}

}
