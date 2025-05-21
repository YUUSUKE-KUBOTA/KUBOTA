package jp.co.scsk.kyushu.no3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedSample {

	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(5, 7, 1, 4, 9, 10, 3, 2, 6, 8);

		System.out.println("昇順①");
		numList.stream()
			.sorted((num1, num2) -> (num1 - num2))
			.forEach(num -> System.out.println(num));

		System.out.println("降順①");
		numList.stream()
			.sorted((num1, num2) -> (num2 - num1))
			.forEach(num -> System.out.println(num));

		System.out.println("昇順②");
		numList.stream()
			.sorted(Comparator.naturalOrder())
			.forEach(num -> System.out.println(num));

		System.out.println("降順②");
		numList.stream()
			.sorted(Comparator.reverseOrder())
			.forEach(num -> System.out.println(num));
	}

}
