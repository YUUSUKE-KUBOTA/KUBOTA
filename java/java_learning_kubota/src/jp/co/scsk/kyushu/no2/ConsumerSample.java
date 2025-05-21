package jp.co.scsk.kyushu.no2;

import java.util.function.Consumer;

public class ConsumerSample {

	public static void main(String[] args) {
		Consumer<Integer> consumer = (score) -> {
			if (score >= 90) {
				System.out.println("優");
			} else if (score >= 70) {
				System.out.println("良");
			} else if (score > 60) {
				System.out.println("可");
			} else {
				System.out.println("不可");
			}
		};
		consumer.accept(65);
	}

}
