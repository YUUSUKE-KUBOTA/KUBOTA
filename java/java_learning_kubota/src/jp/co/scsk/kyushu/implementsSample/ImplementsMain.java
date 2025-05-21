package jp.co.scsk.kyushu.implementsSample;

public class ImplementsMain {
	public static void main(String args[]) {
//		System.out.println(Calculation.plus(5, 3));

		int list[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		CommonProc.exchange(list, 2, 5);
		for (int num : list) {
			System.out.println(num);
		}
	}
}
