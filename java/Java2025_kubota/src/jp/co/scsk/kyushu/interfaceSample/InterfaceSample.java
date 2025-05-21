package jp.co.scsk.kyushu.interfaceSample;

public class InterfaceSample {

	public static void main(String[] args) {
		Plus plus = new Plus();
		System.out.println(plus.calc(5, 2));
		Minus minus = new Minus();
		System.out.println(minus.calc(5, 2));

		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println(MathUtil.sum(nums));
	}

}
