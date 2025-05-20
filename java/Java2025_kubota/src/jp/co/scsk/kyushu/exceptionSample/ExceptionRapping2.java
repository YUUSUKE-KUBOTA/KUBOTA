package jp.co.scsk.kyushu.exceptionSample;

public class ExceptionRapping2 {

	public static void main(String[] args) {
		try {
			System.out.println(Integer.valueOf(5).intValue() / Integer.valueOf(0).intValue());
		} catch (Exception e) {
			System.out.println("例外が発生しました");
		}
	}

}
