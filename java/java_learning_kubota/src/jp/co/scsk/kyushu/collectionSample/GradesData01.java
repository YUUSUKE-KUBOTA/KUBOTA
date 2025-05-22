package jp.co.scsk.kyushu.collectionSample;

import java.util.HashMap;

public class GradesData01 {

	public static void main(String[] args) {
		HashMap<String, Integer> studentScores = new HashMap<>();
		studentScores.put("一郎", Integer.valueOf(100));
		studentScores.put("次郎", Integer.valueOf(90));
		studentScores.put("三郎", Integer.valueOf(86));
		studentScores.put("四郎", Integer.valueOf(75));
		studentScores.put("五郎", Integer.valueOf(98));
		studentScores.put("七郎", Integer.valueOf(60));
		studentScores.put("六郎", Integer.valueOf(49));
		studentScores.put("八郎", Integer.valueOf(84));
		studentScores.put("九郎", Integer.valueOf(76));
		studentScores.put("九郎", Integer.valueOf(80));
		for(String key:studentScores.keySet()) {
			System.out.println(studentScores.values());
		}
	}
}
