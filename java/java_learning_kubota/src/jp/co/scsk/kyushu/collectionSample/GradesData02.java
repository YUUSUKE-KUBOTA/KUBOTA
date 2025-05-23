package jp.co.scsk.kyushu.collectionSample;

import java.util.ArrayList;
import java.util.HashMap;

public class GradesData02 {

	public static void main(String[] args) {

		HashMap<String, Integer> studentScore = new HashMap<>();
		Data02 data02 = new Data02();
		String[] names = data02.getNames();
		int[] points = data02.getPoints();

		for (int i = 0; i < names.length; i++) {
			if (studentScore.containsKey(names[i])) {
				if (studentScore.get(names[i]) < points[i]) {
					studentScore.put(names[i], points[i]);
				}
			} else {
				studentScore.put(names[i], points[i]);
			}
		}
		
		ArrayList<String> mapKeys = new ArrayList<>(studentScore.keySet());
		for (int i = 0; i < mapKeys.size() - 1; i++) {
			for (int j = 0; j < mapKeys.size() - 1 - i; j++) {
				if (studentScore.get(mapKeys.get(j)) < studentScore.get(mapKeys.get(j + 1))) {
					String temp = mapKeys.get(j);
					mapKeys.remove(j);
					mapKeys.add(j, mapKeys.get(j));
					mapKeys.remove(j + 1);
					mapKeys.add(j + 1, temp);
				}
			}
		}
		for (String name : mapKeys) {
			System.out.println(name + ": " + studentScore.get(name));
		}
	}
}