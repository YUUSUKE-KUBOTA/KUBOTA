package jp.co.scsk.kyushu.no3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class OptionalOrElseThrowSample {

	public static void main(String[] args) {
		System.out.println(getList().orElseThrow(() -> new RuntimeException()).size());
	}

	public static Optional<List<Integer>> getList() {
		List<Integer> resultList = null;
		if (new Random().nextBoolean()) {
			resultList = Arrays.asList(1, 2, 3, 4, 5);
		}
		return Optional.ofNullable(resultList);
	}

}
