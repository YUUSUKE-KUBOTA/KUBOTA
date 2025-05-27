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
		String pattern = "^[aA].*";
		return Pattern.matches(pattern, targetStr);
	}

	private static boolean istelephoneFormat(String targetStr) {
		String pattern = "^0\\d{1,4}-\\d{1,4}-\\d{4}$";
		return Pattern.matches(pattern, targetStr);
	}

	private static boolean isMailAddressFormat(String targetStr) {
		String pattern = "^[A-Za-z0-9_]+@[A-Za-z0-9_]+\\.[A-Za-z]{2,}$";
		return Pattern.matches(pattern, targetStr);
	}

	private static boolean isPassword(String targetStr) {
		String pattern = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z]).{8, }$";
		return Pattern.matches(pattern, targetStr);
	}

	private static boolean isNumericOrHalfsmallAlphabet(String targetStr) {
		String pattern = "^[0-9a-z]+$";
		return Pattern.matches(pattern, targetStr);
	}
}
