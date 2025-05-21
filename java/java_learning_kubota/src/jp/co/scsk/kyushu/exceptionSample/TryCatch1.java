package jp.co.scsk.kyushu.exceptionSample;

public class TryCatch1 {

	public static void main(String[] args) {
		int x = 5;
		int y = 0;

		try {
			System.out.println(x / y);		// 例外が発生し得る処理
		} catch (ArithmeticException e) {
			System.out.println("例外発生時の処理です");
		} finally {
			System.out.println("例外の発生有無に関わらず実行される処理です");
		}
	}

}
