package jp.co.scsk.kyushu.no1;

import java.util.HashMap;

import jp.co.scsk.kyushu.model.Score;
import jp.co.scsk.kyushu.util.Scores;
import jp.co.scsk.kyushu.util.Students;

public class HomeWork1_ModelAnswers {

	public static void main(String[] args) {
		// オブジェクト型での平均点計算
		HashMap<String, Score> students = Students.createStudents();
		students = reviseJapaneseScore1(students);
		System.out.println(getJapaneseAveragePoint1(students));

		// プリミティブ型での平均点計算
		int[] japaneseScores = Scores.getJapaneseScores();
		japaneseScores = reviseJapaneseScore2(japaneseScores);
		System.out.println(getJapaneseAveragePoint2(japaneseScores));
	}

	private static HashMap<String, Score> reviseJapaneseScore1(HashMap<String, Score> map) {
		for (String name : map.keySet()) {
			map.get(name).setJapanese(map.get(name).getJapanese() + 5);
		}
		return map;
	}

	private static double getJapaneseAveragePoint1(HashMap<String, Score> map) {
		double sum = 0;
		for (String name : map.keySet()) {
			sum += map.get(name).getJapanese();
		}
		return sum / map.keySet().size();
	}

	private static int[] reviseJapaneseScore2(int[]  array) {
		for (int index = 0; index < array.length; index++) {
			array[index] += 5;
		}
		return array;
	}

	private static double getJapaneseAveragePoint2(int[] array) {
		double sum = 0;
		for (int score : array) {
			sum += score;
		}
		return sum / array.length;
	}
}
