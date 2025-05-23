package jp.co.scsk.kyushu.collectionSample;

import java.util.ArrayList;
import java.util.HashMap;

public class GradesData03 {
	public static void main(String[] args) {

		HashMap<String, ArrayList<Integer>> studentScore = new HashMap<>();
		Data02 data02 = new Data02();
		String[] names = data02.getNames();
		int[] points = data02.getPoints();

		for (int i = 0; i < names.length; i++) {
			if (!studentScore.containsKey(names[i])) {
				studentScore.put(names[i],  new ArrayList<>());
			}
			studentScore.get(names[i]).add(points[i]);
		}

		for (String name : studentScore.keySet()) {
			System.out.println(name + ": " + studentScore.get(name));
		}
	}
}