package jp.co.scsk.kyushu.no1;

import java.util.HashMap;

import jp.co.scsk.kyushu.model.Score;

public class HomeWork4 {

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
		// TODO getterメソッドの文字列を生成してリフレクションで値を設定する処理
	}
}
