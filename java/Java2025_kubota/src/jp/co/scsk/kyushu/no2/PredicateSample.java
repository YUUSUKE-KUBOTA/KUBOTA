package jp.co.scsk.kyushu.no2;

import java.util.function.Predicate;

public class PredicateSample {

	public static void main(String[] args) {
		Predicate<Integer> predicate = (score) -> {
			return score >= 60 ? true : false;
		};
		predicate.test(50);
	}

}
