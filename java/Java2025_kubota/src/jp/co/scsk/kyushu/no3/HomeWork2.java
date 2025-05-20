package jp.co.scsk.kyushu.no3;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class HomeWork2 {

	public static void main(String[] args) {
		List<String> list = getList();
		if (list == null) {
			System.out.println();
		} else {
			System.out.println(list);
		}
		if (list != null) {
			for (String str : list) {
				System.out.println(str);
			}
		}
		if (list == null) {
			throw new RuntimeException();
		} else {
			System.out.println(list);
		}
	}

	public static List<String> getList() {
		if (new Random().nextBoolean()) {
			return Arrays.asList("Apple", "Orange", "Lemon", "Grape", "Banana", "Peach");
		}
		return null;
	}

}
