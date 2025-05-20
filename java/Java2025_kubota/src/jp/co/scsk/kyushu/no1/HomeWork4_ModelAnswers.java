package jp.co.scsk.kyushu.no1;

import java.lang.reflect.Method;
import java.util.HashMap;

import jp.co.scsk.kyushu.model.Score;

public class HomeWork4_ModelAnswers {

	public static void main(String[] args) {
		HashMap<String, Integer> scoreMap = new HashMap<String, Integer>();
		scoreMap.put("japanese", 25);
		scoreMap.put("math", 80);
		scoreMap.put("english", 51);
		scoreMap.put("science", 90);
		scoreMap.put("social", 74);

		Score score = new Score();
		setScore(score, scoreMap);
		System.out.println("国語：" + score.getJapanese());
		System.out.println("数学：" + score.getMath());
		System.out.println("英語：" + score.getEnglish());
	}

	private static void setScore(Score score, HashMap<String, Integer> scoreMap) {
		for (String key : scoreMap.keySet()) {
			try {
				String subjectName = key.substring(0, 1).toUpperCase() + key.substring(1);
				Method m = Score.class.getMethod("set" + subjectName.toString(), int.class);
				m.invoke(score, scoreMap.get(key));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
