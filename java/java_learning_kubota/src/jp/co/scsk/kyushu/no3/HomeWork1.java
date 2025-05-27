package jp.co.scsk.kyushu.no3;

import java.util.Arrays;
import java.util.List;

public class HomeWork1 {

	public static void main(String[] args) {
		List<String> strList = Arrays.asList("Apple", "Orange", "Lemon", "Grape", "Banana", "Peach");
		String pattern = "[Aa]";
		strList.stream()
			.map(str -> str.replaceAll(pattern, ""))
			.forEach(str -> System.out.println(str.length()));
	}
}