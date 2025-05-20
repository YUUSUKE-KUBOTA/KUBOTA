package jp.co.scsk.kyushu.setSample;

import java.util.HashSet;

public class SetSample {

	public static void main(String args[]) {
		newSample();
		duplicationSample();
		addSample();
		clearSample();
		removeSample();
		sizeSample();
		isEmptySample();
		containsSample();
		loopSetSample();
	}

	private static void newSample() {
		System.out.println("-- newSample --");
		HashSet<String> set = new HashSet<String>();
		set.add("AAA");
		System.out.println(set.toString());
	}

	private static void duplicationSample() {
		System.out.println("-- duplicationSample --");
		HashSet<String> set = new HashSet<String>();
		set.add("AAA");
		set.add("AAA");
		System.out.println(set.toString());
	}

	private static void addSample() {
		System.out.println("-- addSample --");
		HashSet<String> set = new HashSet<String>();
		set.add("AAA");
		System.out.println("setの要素は" + set.toString());
		set.add("BBB");
		System.out.println("setの要素は" + set.toString());
	}

	private static void clearSample() {
		System.out.println("-- clearSample --");
		HashSet<String> set = new HashSet<String>();
		set.add("AAA");
		set.add("BBB");
		System.out.println("setの要素は" + set.toString());
		set.clear();
		System.out.println("setの要素は" + set.toString());
	}

	private static void removeSample() {
		System.out.println("-- removeSample --");
		HashSet<String> set = new HashSet<String>();
		set.add("AAA");
		set.add("BBB");
		System.out.println("setの要素は" + set.toString());
		set.remove("AAA");
		System.out.println("setの要素は" + set.toString());
	}

	private static void sizeSample() {
		System.out.println("-- setSample --");
		HashSet<String> set = new HashSet<String>();
		System.out.println("setの要素数は" + set.size());
		set.add("AAA");
		set.add("BBB");
		set.add("CCC");
		System.out.println("setの要素数は" + set.size());
	}

	private static void isEmptySample() {
		System.out.println("-- isEmptySample --");
		HashSet<String> set = new HashSet<String>();
		if (set.isEmpty()) {
			System.out.println("setは空です");
		} else {
			System.out.println("setは空ではありません");
		}
		set.add("AAA");
		set.add("BBB");
		if (set.isEmpty()) {
			System.out.println("setは空です");
		} else {
			System.out.println("setは空ではありません");
		}
	}

	private static void containsSample() {
		System.out.println("-- containsSample --");
		HashSet<String> set = new HashSet<String>();
		set.add("AAA");
		set.add("BBB");
		set.add("CCC");
		System.out.println(set.contains("BBB"));
		System.out.println(set.contains("123"));
	}

	private static void loopSetSample() {
		System.out.println("-- loopSetSample --");
		HashSet<String> set = new HashSet<String>();
		set.add("AAA");
		set.add("BBB");
		set.add("CCC");
		for (String str : set) {
			System.out.println(str);
		}
	}
}
