package jp.co.scsk.kyushu.exceptionSample;

import java.util.ArrayList;

public class Exercises01 {

	public static void main(String[] args) {
		ArrayList<String> inputs = InputUtil.input();
		if (inputs != null && inputs.size() == 2) {
			String str1 = inputs.get(0);
			String str2 = inputs.get(1);
			try {
				System.out.println(div(str1, str2));
			} catch (NumberFormatException e) {
				System.out.println("数字ではありません");
			} catch (NullPointerException e) {
				System.out.println("値が指定されていません");
			}
		} else {
			System.out.println("入力の取得に失敗しました");
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