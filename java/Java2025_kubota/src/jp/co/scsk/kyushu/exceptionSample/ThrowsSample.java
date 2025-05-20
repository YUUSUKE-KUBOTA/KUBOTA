package jp.co.scsk.kyushu.exceptionSample;

public class ThrowsSample {

	public static void main(String args[]) {
		System.out.println(div(5, 0));
	}

	public static int div(int num1, int num2) throws ArithmeticException{
		return num1 / num2;
	}
}
