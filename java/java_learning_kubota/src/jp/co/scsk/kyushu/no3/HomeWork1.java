package jp.co.scsk.kyushu.no3;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class HomeWork1 {

	public static void main(String[] args) {
		List<String> strList = Arrays.asList("Apple", "Orange", "Lemon", "Grape", "Banana", "Peach");
		String pattern = "[Aa]";
		strList.stream()
			.filter(str -> Pattern.compile(pattern).matcher(str).find())
			.map(str -> str.replaceAll(pattern, ""))
			.forEach(str -> System.out.println(str.length()));
	}
}