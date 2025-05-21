package jp.co.scsk.kyushu.interfaceSample;

public class Plus implements Calculation {
	@Override
	public int calc(int x, int y) {
		return x + y;
	}
}
