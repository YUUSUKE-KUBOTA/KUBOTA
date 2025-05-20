package jp.co.scsk.kyushu.implementsSample;

public interface Calculation {
	int calc(int x, int y);

	default public int calc2(int x, int y) {
		return x + y;
	}

	public static int plus(int x, int y) {
		return x + y;
	}
}
