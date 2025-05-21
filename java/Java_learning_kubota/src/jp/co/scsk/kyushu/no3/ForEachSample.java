package jp.co.scsk.kyushu.no3;

import java.util.Arrays;
import java.util.List;

public class ForEachSample {

	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		numList.stream().forEach(num -> {
			if (num % 2 == 0) {
				System.out.println(num + "は偶数です");
			} else {
				System.out.println(num + "は奇数です");
			}
		});
	}

}
