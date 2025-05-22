package jp.co.scsk.kyushu.collectionSample;

import java.util.ArrayList;
import java.util.HashMap;

public class GradesData02 {

	public static void main(String[] args) {

		HashMap<ArrayList<String>, Integer> StudentScore = new HashMap<>();
		Data02 data02 = new Data02();
		String[] names = data02.getNames();
		int[] points = data02.getPoints();

		for (int i = 0; i < names.length; i++) {
			if (StudentScore.containsKey(names[i])) {

			}

			StudentScore.put(names[i], points[i]);

		}
	}
}
