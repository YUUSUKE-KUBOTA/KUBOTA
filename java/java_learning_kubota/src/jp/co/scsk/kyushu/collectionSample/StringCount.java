package jp.co.scsk.kyushu.collectionSample;

import java.util.HashMap;

public class StringCount {
	public static void main(String[] args) {
		InputUtil inputData = new InputUtil();
		String data = inputData.input();
		String[] splitData = data.split("");
		HashMap<String, Integer> countStr = new HashMap<>();

		for (int i = 0; i < splitData.length; i++) {
			String charStr = splitData[i];
			if (!countStr.containsKey(charStr)) {
				countStr.put(charStr, 1);
			} else {
				countStr.put(charStr, countStr.get(charStr) + 1);
			}
		}

		for (String charStr : countStr.keySet()) {
			System.out.println(charStr + ":" + countStr.get(charStr) + "個分入力");
		}
	}
}
