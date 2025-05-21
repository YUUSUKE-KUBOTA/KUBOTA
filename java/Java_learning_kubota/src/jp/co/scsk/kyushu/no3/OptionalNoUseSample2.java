package jp.co.scsk.kyushu.no3;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class OptionalNoUseSample2 {

	public static void main(String[] args) {
		List<Integer> list = getList();
		System.out.println(list == null ? 0 : list.size());
	}

	public static List<Integer> getList() {
		if (new Random().nextBoolean()) {
			return Arrays.asList(1, 2, 3, 4, 5);
		}
		return null;
	}

}
