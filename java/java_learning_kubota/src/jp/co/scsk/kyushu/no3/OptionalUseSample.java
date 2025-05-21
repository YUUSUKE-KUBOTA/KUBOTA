package jp.co.scsk.kyushu.no3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class OptionalUseSample {

	public static void main(String[] args) {
		System.out.println(getList().orElse(new ArrayList<Integer>()).size());
	}

	public static Optional<List<Integer>> getList() {
		List<Integer> resultList = null;
		if (new Random().nextBoolean()) {
			resultList = Arrays.asList(1, 2, 3, 4, 5);
		}
		return Optional.ofNullable(resultList);
	}

}
