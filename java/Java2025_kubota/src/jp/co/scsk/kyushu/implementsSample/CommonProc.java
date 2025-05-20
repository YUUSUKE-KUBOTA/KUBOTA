package jp.co.scsk.kyushu.implementsSample;

public interface CommonProc {
	public static void exchange(int[] list, int i, int j) {
		int num = list[i];
		list[i] = list[j];
		list[j] = num;
	}
}
