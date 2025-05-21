package jp.co.scsk.kyushu.no3;

import java.util.Arrays;
import java.util.List;

public class MapSample {

	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		numList.stream()
			.map(num -> num + 100)
			.forEach(num -> System.out.println(num));
	}

}
