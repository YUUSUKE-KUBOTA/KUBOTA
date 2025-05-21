package jp.co.scsk.kyushu.no2;

import java.util.function.BiFunction;

public class HomeWork_ModelAnswer {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Double> sum = (num1, num2) -> {
			return Double.valueOf(num1 + num2);
		};
		System.out.println(sum.apply(5, 3));

		BiFunction<Integer, Integer, Double> sub = (num1, num2) -> {
			return Double.valueOf(num1 - num2);
		};
		System.out.println(sub.apply(5, 3));
	}

}
