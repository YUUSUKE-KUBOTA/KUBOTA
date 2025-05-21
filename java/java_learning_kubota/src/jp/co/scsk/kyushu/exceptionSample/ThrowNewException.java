package jp.co.scsk.kyushu.exceptionSample;

public class ThrowNewException {

	public static void main(String[] args) {
		try {
			String str = null;
			if (str == null) {
				throw new NullPointerException();
			}
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}

}
