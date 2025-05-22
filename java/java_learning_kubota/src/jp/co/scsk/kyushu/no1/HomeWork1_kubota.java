package jp.co.scsk.kyushu.no1;

import java.util.HashMap;

import jp.co.scsk.kyushu.model.Score;
import jp.co.scsk.kyushu.util.Scores;
import jp.co.scsk.kyushu.util.Students;

public class HomeWork1_kubota {

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
		// TODO このメソッドを修正
		return null;
	}

	private static double getJapaneseAveragePoint1(HashMap<String, Score> map) {
		// TODO このメソッドを修正
		return 0.0;
	}

	private static int[] reviseJapaneseScore2(int[]  array) {
		// TODO このメソッドを修正
		return null;
	}

	private static double getJapaneseAveragePoint2(int[] array) {
		// TODO このメソッドを修正
		return 0.0;
	}
}
