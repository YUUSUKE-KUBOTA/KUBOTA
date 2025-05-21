package jp.co.scsk.kyushu.implementsSample;

public class Sub implements Calculation {

	@Override
	public int calc(int x, int y) {
		return x - y;
	}

	@Override
	public int calc2(int x, int y) {
		return x - y;
	}

}
