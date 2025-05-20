package jp.co.scsk.kyushu.no1;

import java.util.HashMap;

import jp.co.scsk.kyushu.model.Score;
import jp.co.scsk.kyushu.util.Students;

public class HomeWork2 {

	public static void main(String[] args) {
		HashMap<String, Score> students1 = Students.createStudents();
		HashMap<String, Score> students2 = createInterviewsList(students1);
		printScores(students1);
		printInterviewsList(students2);
	}

	private static HashMap<String, Score> createInterviewsList(HashMap<String, Score> map) {
		Score average = new Score();
		for (String name : map.keySet()) {
			Score score = map.get(name);
			average.setJapanese(average.getJapanese() + score.getJapanese());
			average.setMath(average.getMath() + score.getMath());
			average.setEnglish(average.getEnglish() + score.getEnglish());
		}
		int peoples = map.keySet().size();
		average.setJapanese((int)Math.ceil((double)average.getJapanese() / peoples));
		average.setMath((int)Math.ceil((double)average.getMath() / peoples));
		average.setEnglish((int)Math.ceil((double)average.getEnglish() / peoples));

		// TODO これ以降を修正

		return null;
	}

	private static void printScores(HashMap<String, Score> map) {
		System.out.println("=== 成績表示 ===");
		for (String name : map.keySet()) {
			System.out.println("--- " + name + "さんの成績 ---");
			System.out.println("  国語：" + map.get(name).getJapanese());
			System.out.println("  数学：" + map.get(name).getMath());
			System.out.println("  英語：" + map.get(name).getEnglish());
		}
	}

	private static void printInterviewsList(HashMap<String, Score> map) {
		System.out.println("=== 面談用リスト ===");
		for (String name : map.keySet()) {
			System.out.println("--- " + name + "さんは全体平均まで。。。 ---");
			System.out.println("  国語：" + map.get(name).getJapanese());
			System.out.println("  数学：" + map.get(name).getMath());
			System.out.println("  英語：" + map.get(name).getEnglish());
		}
	}
}
