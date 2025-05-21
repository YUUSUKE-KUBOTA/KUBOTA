package jp.co.scsk.kyushu.no2;

import java.util.function.Function;

public class FunctionSample {

	public static void main(String[] args) {
		Function<Integer, String> fuction = (score) -> {
			if (score >= 90) {
				return "優";
			} else if (score >= 70) {
				return "良";
			} else if (score > 60) {
				return "可";
			} else {
				return "不可";
			}
		};
		System.out.println(fuction.apply(75));
	}

}
