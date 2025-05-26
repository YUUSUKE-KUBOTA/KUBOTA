package jp.co.scsk.kyushu.no1;

import java.util.regex.Pattern;

public class HomeWork5_kubota {

	public static void main(String[] args) {
		System.out.println("--- ① ---");
		System.out.println(isStartA("ABCDE"));
		System.out.println(isStartA("abcde"));
		System.out.println(isStartA("EDCBA"));
		System.out.println(isStartA("edcba"));
		System.out.println("--- ② ---");
		System.out.println(istelephoneFormat("090-1234-5678"));
		System.out.println(istelephoneFormat("090-1234-56789"));
		System.out.println(istelephoneFormat("0-1234-5678"));
		System.out.println(istelephoneFormat("03-1234-5678"));
		System.out.println(istelephoneFormat("092-123-4567"));
		System.out.println(istelephoneFormat("0985-12-3456"));
		System.out.println("--- ③ ---");
		System.out.println(isMailAddressFormat("あいう@xyz.com"));
		System.out.println(isMailAddressFormat("abc@xyz.com"));
		System.out.println(isMailAddressFormat("abc_123@xyz.com"));
		System.out.println(isMailAddressFormat("abc-123@xyz.com"));
		System.out.println(isMailAddressFormat("@xyz.com"));
		System.out.println(isMailAddressFormat("abc@"));
		System.out.println(isMailAddressFormat("abc@xyz"));
		System.out.println("--- ④ ---");
		System.out.println(isPassword("abcABC123"));
		System.out.println(isPassword("abAB12"));
		System.out.println(isPassword("ABCDEFGHIJ"));
		System.out.println(isPassword("abcdefghij"));
		System.out.println(isPassword("1234567890"));
		System.out.println(isPassword("ABCDEabcde"));
		System.out.println(isPassword("12345ABCDE"));
		System.out.println("--- ⑤ ---");
		System.out.println(isNumericOrHalfsmallAlphabet("12345abcde"));
		System.out.println(isNumericOrHalfsmallAlphabet("12345ABCDE"));
		System.out.println(isNumericOrHalfsmallAlphabet("abcdeABCDE"));
		System.out.println(isNumericOrHalfsmallAlphabet("12345"));
		System.out.println(isNumericOrHalfsmallAlphabet("abcde"));
		System.out.println(isNumericOrHalfsmallAlphabet("ABCDE"));
		System.out.println(isNumericOrHalfsmallAlphabet("123abc!"));
		System.out.println(isNumericOrHalfsmallAlphabet("123abc_"));
		System.out.println(isNumericOrHalfsmallAlphabet("１２３４５"));
	}

	private static boolean isStartA(String targetStr) {
		// 先頭が「A」もしくは「a」から始まる文字列かを判定する処理を記述
		return Pattern.compile("^(a|A)").matcher(targetStr).find();
	}

	private static boolean istelephoneFormat(String targetStr) {
		// 日本国内の電話番号の書式かどうか（ハイフン含む）
		return Pattern.compile("^.{12,13}$").matcher(targetStr).find()
				&& Pattern.compile("^[0-9]+-[0-9]+-[0-9]+$").matcher(targetStr).find();
	}

	private static boolean isMailAddressFormat(String targetStr) {
		// メールアドレスの書式かどうか
		return Pattern.compile("^\\w+@[\\w\\.]+\\.\\w+").matcher(targetStr).find();
	}

	private static boolean isPassword(String targetStr) {
		// 半角数字、半角小文字、半角大文字の全てを含む文字列
		return Pattern.compile("^.{8,}$").matcher(targetStr).find()
				&& Pattern.compile("[0-9]+").matcher(targetStr).find()
				&& Pattern.compile("[a-z]+").matcher(targetStr).find()
				&& Pattern.compile("[A-Z]+").matcher(targetStr).find();
	}

	private static boolean isNumericOrHalfsmallAlphabet(String targetStr) {
		// 半角数字と半角小文字しか含まない文字列
		return Pattern.compile("^[0-9a-z]*$").matcher(targetStr).find();
	}
}

