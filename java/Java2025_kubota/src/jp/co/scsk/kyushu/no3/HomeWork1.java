package jp.co.scsk.kyushu.no3;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class HomeWork1 {

	public static void main(String[] args) {
		List<String> strList = Arrays.asList("Apple", "Orange", "Lemon", "Grape", "Banana", "Peach");
		for (String str : strList) {
			if (Pattern.compile("(A|a)").matcher(str).find()) {
				System.out.println(str.replaceAll("(A|a)", "").length());
			}
		}
	}

}
