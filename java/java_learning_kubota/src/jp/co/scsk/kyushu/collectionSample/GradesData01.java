package jp.co.scsk.kyushu.collectionSample;

import java.util.HashMap;

public class GradesData01 {

	public static void main(String[] args) {
		int sum = 0;
		int count = 0;
		int ave = 0;

		HashMap<String, Integer> studentScores = new HashMap<>();
		Data01 data01 = new Data01();
		String[] names = data01.getNames();
		int[] points = data01.getPoints();

		for (int i = 0; i < names.length; i++) {
			studentScores.put(names[i], points[i]);
		}

		for (int score : studentScores.values()) {
			sum += score;
			count++;
		}
		ave = sum / count;

		System.out.println("Total sum of scores: " + sum);
		System.out.println("Total ave of scores: " + ave);
	}
}
