package jp.co.scsk.kyushu.exceptionSample;

public class TryCatch2 {

	public static void main(String[] args) {
		try {
			System.out.println(Integer.valueOf(5).intValue() / Integer.valueOf(0).intValue());
		} catch (NumberFormatException e) {
			System.out.println("数値への変換処理で例外が発生しました");
		} catch (ArithmeticException e) {
			System.out.println("０除算例外が発生しました");
		}
	}

}
