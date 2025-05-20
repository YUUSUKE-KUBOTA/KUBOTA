package jp.co.scsk.kyushu.interfaceSample;

public interface MathUtil {
	public static int sum(int... nums) {
		int sum = 0;
		for (int num : nums) {
			sum += num;
		}
		return sum;
	}
}
