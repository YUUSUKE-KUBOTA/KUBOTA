package jp.co.scsk.kyushu.listSample;

import java.util.ArrayList;

public class ListSample {

	public static void main(String[] args) {
		newSample();
		addSample();
		addSample2();
		getSample();
		removeSample();
		sizeSample();
		isEmptySample();
		indexOfSample();
		containsSample();
		addAllSample();
		duplicationSample();
		loopListSample();
	}

	private static void newSample() {
		System.out.println("-- newSample --");
		ArrayList<String> list = new ArrayList<String>();
		list.add("AAA");
		System.out.println(list.toString());
	}

	private static void addSample() {
		System.out.println("-- addSample --");
		ArrayList<String> list = new ArrayList<String>();
		list.add("AAA");
		System.out.println("listの最後の要素は" + list.get(list.size() - 1));
		list.add("BBB");
		System.out.println("listの0番目の要素は" + list.get(0));
		System.out.println("listの最後の要素は" + list.get(list.size() - 1));
	}

	private static void addSample2() {
		System.out.println("-- addSample2 --");
		ArrayList<String> list = new ArrayList<String>();
		list.add("AAA");
		System.out.println("listの0番目の要素は" + list.get(0));
		list.add(0, "BBB");
		System.out.println("listの0番目の要素は" + list.get(0));
		System.out.println("listの最後の要素は" + list.get(list.size() - 1));
	}

	private static void getSample() {
		System.out.println("-- getSample --");
		ArrayList<String> list = new ArrayList<String>();
		list.add("AAA");
		list.add("BBB");
		list.add("CCC");
		System.out.println("listの0番目の要素は" + list.get(0));
		System.out.println("listの2番目の要素は" + list.get(2));
	}

	private static void removeSample() {
		System.out.println("-- removeSample --");
		ArrayList<String> list = new ArrayList<String>();
		list.add("AAA");
		list.add("BBB");
		System.out.println("listの0番目の要素は" + list.get(0));
		list.remove(0);
		System.out.println("listの0番目の要素は" + list.get(0));
	}

	private static void sizeSample() {
		System.out.println("-- sizeSample --");
		ArrayList<String> list = new ArrayList<String>();
		System.out.println("listの要素数は" + list.size());
		list.add("AAA");
		list.add("BBB");
		list.add("CCC");
		System.out.println("listの要素数は" + list.size());
	}

	private static void isEmptySample() {
		System.out.println("-- isEmptySample --");
		ArrayList<String> list = new ArrayList<String>();
		if (list.isEmpty()) {
			System.out.println("listは空です");
		} else {
			System.out.println("listは空ではありません");
		}
		list.add("AAA");
		list.add("BBB");
		if (list.isEmpty()) {
			System.out.println("listは空です");
		} else {
			System.out.println("listは空ではありません");
		}
	}

	private static void indexOfSample() {
		System.out.println("-- indexOfSample --");
		ArrayList<String> list = new ArrayList<String>();
		list.add("AAA");
		list.add("BBB");
		String strC = new String("CCC");
		list.add(strC);
		System.out.println(list.indexOf("BBB"));
		System.out.println(list.indexOf("CCC"));
		System.out.println(list.indexOf("XXX"));
	}

	private static void containsSample() {
		System.out.println("-- containsSample --");
		ArrayList<String> list = new ArrayList<String>();
		list.add("AAA");
		list.add("BBB");
		String strC = new String("CCC");
		list.add(strC);
		System.out.println(list.contains("BBB"));
		System.out.println(list.contains("CCC"));
		System.out.println(list.contains("XXX"));
	}

	private static void addAllSample() {
		System.out.println("-- addAllSample --");
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("AAA");
		list1.add("BBB");
		list1.add("CCC");
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("111");
		list2.add("222");
		list2.add("333");
		list1.addAll(list2);
		for (String str : list1) {
			System.out.println(str);
		}
	}

	private static void duplicationSample() {
		System.out.println("-- duplicationSample --");
		ArrayList<String> list = new ArrayList<String>();
		list.add("AAA");
		list.add("AAA");
		list.add("AAA");
		list.add("AAA");
		list.add("AAA");
		System.out.println(list.toString());
	}

	private static void loopListSample() {
		System.out.println("-- loopListSample --");
		ArrayList<String> list = new ArrayList<String>();
		list.add("AAA");
		list.add("BBB");
		list.add("CCC");
		for (String str : list) {
			System.out.println(str);
		}
	}
}
