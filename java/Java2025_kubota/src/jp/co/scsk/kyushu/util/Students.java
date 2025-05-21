package jp.co.scsk.kyushu.util;

import java.util.HashMap;

import jp.co.scsk.kyushu.model.Score;

public class Students {
	public static HashMap<String, Score> createStudents() {
		HashMap<String, Score> students = new HashMap<String, Score>();
		students.put("一郎", new Score(39, 43, 53));
		students.put("次郎", new Score(89, 20, 65));
		students.put("佐武郎", new Score(43, 58, 81));
		students.put("史郎", new Score(53, 45, 63));
		students.put("吾郎", new Score(91, 30, 71));
		students.put("禄郎", new Score(36, 49, 8));
		students.put("志知郎", new Score(39, 77, 83));
		students.put("釟郎", new Score(23, 57, 87));
		students.put("九郎", new Score(58, 29, 94));
		students.put("充郎", new Score(26, 39, 74));
		return students;
	}
}
