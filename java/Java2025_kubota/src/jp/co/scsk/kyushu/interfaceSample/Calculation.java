package jp.co.scsk.kyushu.interfaceSample;

public interface Calculation {
	default public int calc(int x, int y) {
		return x + y;
	}
}
