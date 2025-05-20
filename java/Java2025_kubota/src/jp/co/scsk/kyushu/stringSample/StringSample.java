package jp.co.scsk.kyushu.stringSample;

import java.util.regex.Pattern;

public class StringSample {

	public static void main(String[] args) {
//		instanceSample();
//		concatSample();
//		stringBufferSample();
//		splitSample();
//		splitSample2();
//		replaceSample();
//		replaceAllSample();
//		indexOfSample();
		equalsSample();
		compileSample();
	}

	private static void instanceSample() {
		String str1 = new String("ABC");
		String str2 = "123";

		System.out.println(str1);
		System.out.println(str2);
	}

	private static void concatSample() {
		String str1 = "この文字列と";
		String str2 = "この文字列を結合します";
		System.out.println(str1.concat(str2));
		System.out.println(str1 + str2);
	}

	private static void stringBufferSample() {
		StringBuffer sb = new StringBuffer();
		sb.append("この文字列と");
		sb.append("この文字列を結合します");
		String str = sb.toString();
		System.out.println(str);
	}

	private static void splitSample() {
		String str1 = "abc,def,ghi,jkl,mno";
		String[] str2 = str1.split(",");
		for (String str3 : str2) {
			System.out.println(str3);
		}
	}

	private static void splitSample2() {
		String str1 = "abc	def	ghi	jkl	mno";
		String[] str2 = str1.split("\t");
		for (String str3 : str2) {
			System.out.println(str3);
		}
	}

	private static void replaceSample() {
		String str = "abcdef";
		System.out.println(str.replace("bcd", "BCD"));
	}

	private static void replaceAllSample() {
		String str = "abc123def123";
		System.out.println(str.replaceAll("[a-z]+", "0"));
		System.out.println(str.replaceAll("[a-z]", "0"));
	}

	private static void indexOfSample() {
		String str = "abcdefg";
		System.out.println(str.indexOf("ef"));
		System.out.println(str.indexOf("EF"));
	}

	private static void equalsSample() {
		String str1 = new String("abcde");
		String str2 = new String("abcde");
		if (str1.equals(str2)) {
			System.out.println("比較結果は同じです");
		} else {
			System.out.println("比較結果は違います");
		}
		if (str1 == str2) {
			System.out.println("比較結果は同じです");
		} else {
			System.out.println("比較結果は違います");
		}
	}

	private static void compileSample() {
		String str1 = new String("abcde");
		String str2 = new String("abcde");
		String str3 = new String("bcd");

		if (Pattern.compile(str1).matcher(str2).matches()) {
			System.out.println("比較結果は同じです");
		} else {
			System.out.println("比較結果は違います");
		}
		if (Pattern.compile(str1).matcher(str3).matches()) {
			System.out.println("比較結果は同じです");
		} else {
			System.out.println("比較結果は違います");
		}
		if (Pattern.compile(str3).matcher(str1).find()) {
			System.out.println("比較結果は同じです");
		} else {
			System.out.println("比較結果は違います");
		}
		if (Pattern.compile(str1).matcher(str3).find()) {
			System.out.println("比較結果は同じです");
		} else {
			System.out.println("比較結果は違います");
		}
	}
}
