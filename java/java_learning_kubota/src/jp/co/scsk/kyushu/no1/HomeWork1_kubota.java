package jp.co.scsk.kyushu.no1;

import java.util.HashMap;

import jp.co.scsk.kyushu.model.Score;
import jp.co.scsk.kyushu.util.Scores;
import jp.co.scsk.kyushu.util.Students;

public class HomeWork1_kubota {

	public static void main(String[] args) {
		// オブジェクト型での平均点計算
		HashMap<String, Score> students = Students.createStudents();
		reviseJapaneseScore1(students);
		System.out.println(getJapaneseAveragePoint1(students));

		// プリミティブ型での平均点計算
		int[] japaneseScores = Scores.getJapaneseScores();
		reviseJapaneseScore2(japaneseScores);
		System.out.println(getJapaneseAveragePoint2(japaneseScores));
	}

	private static void reviseJapaneseScore1(HashMap<String, Score> map) {
		for (Score score : map.values()) {
			score.setJapanese(score.getJapanese() + 5);
		}
	}

	private static double getJapaneseAveragePoint1(HashMap<String, Score> map) {
		int sum = 0;
		double ave = 0;
		for (String name : map.keySet()) {
			sum += map.get(name).getJapanese();
		}
		ave = (double)sum / map.keySet().size();
		return ave;
	}

	private static void reviseJapaneseScore2(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] += 5;
		}
	}

	private static double getJapaneseAveragePoint2(int[] array) {
		int sum = 0;
		double ave = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		ave = (double)sum / array.length;
		return ave;
	}
}
