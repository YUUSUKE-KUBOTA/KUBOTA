package jp.co.scsk.kyushu.exceptionSample;

public class ExceptionRapping1 {

	public static void main(String[] args) throws Exception {
		try {
			System.out.println(5 / 0);
		} catch (ArithmeticException e) {
			throw new Exception(e);
		}
	}

}
