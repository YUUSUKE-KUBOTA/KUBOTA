package jp.co.scsk.kyushu.no3;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class OptionalNoUseSample {

	public static void main(String[] args) {
		System.out.println(getList().size());
	}

	public static List<Integer> getList() {
		if (new Random().nextBoolean()) {
			return Arrays.asList(1, 2, 3, 4, 5);
		}
		return null;
	}

}
