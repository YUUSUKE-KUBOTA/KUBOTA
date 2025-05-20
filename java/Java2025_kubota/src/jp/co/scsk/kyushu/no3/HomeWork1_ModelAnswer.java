package jp.co.scsk.kyushu.no3;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class HomeWork1_ModelAnswer {

	public static void main(String[] args) {
		List<String> strList = Arrays.asList("Apple", "Orange", "Lemon", "Grape", "Banana", "Peach");
		strList.stream()
			.filter(str -> Pattern.compile("(A|a)").matcher(str).find())
			.map(str -> str.replaceAll("(A|a)", ""))
			.map(str -> str.length())
			.forEach(size -> System.out.println(size));
	}

}
