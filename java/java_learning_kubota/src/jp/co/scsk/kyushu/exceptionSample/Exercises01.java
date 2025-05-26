package jp.co.scsk.kyushu.exceptionSample;

import java.util.ArrayList;

public class Exercises01 {

	public static void main(String[] args) {
		ArrayList<String> inputs = InputUtil.input();

		try {
			System.out.println(div(inputs.get(0), inputs.get(1)));
		} catch (NumberFormatException e) {
			System.out.println("数字ではありません");
		} catch (NullPointerException e) {
			System.out.println("値が指定されていません");
		}
	}

	public static String div(String str1, String str2) {
		if (str1 == null && str2 == null) {
			throw new NullPointerException();
		}
		try {
			int num1 = (str1 != null) ? Integer.parseInt(str1) : 0;
			int num2 = (str2 != null) ? Integer.parseInt(str2) : 0;
			if (num2 == 0) {
				return "∞";
			}
			return String.valueOf(num1 / num2);
		} catch (NumberFormatException e) {
			throw e;
		}
	}
}