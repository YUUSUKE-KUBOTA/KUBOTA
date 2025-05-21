package jp.co.scsk.kyushu.implementsSample;

public class Add implements Calculation {

	@Override
	public int calc(int x, int y) {
		return x + y;
	}

}
