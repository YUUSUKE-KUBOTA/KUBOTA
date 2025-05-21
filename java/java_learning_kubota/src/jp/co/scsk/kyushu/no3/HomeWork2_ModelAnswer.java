package jp.co.scsk.kyushu.no3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class HomeWork2_ModelAnswer {

	public static void main(String[] args) {
		Optional<List<String>> opt = getList();

		System.out.println(opt.isPresent() ? opt.get() : "listはnullです");
		opt.ifPresent(list -> {
			list.stream().forEach(str -> {
				System.out.println(str);
			});
		});
		System.out.println(opt.orElseThrow(() -> new RuntimeException()));
	}

	public static Optional<List<String>> getList() {
		List<String> resultList = null;
		if (new Random().nextBoolean()) {
			resultList = Arrays.asList("Apple", "Orange", "Lemon", "Grape", "Banana", "Peach");
		}
		return Optional.ofNullable(resultList);
	}

}
