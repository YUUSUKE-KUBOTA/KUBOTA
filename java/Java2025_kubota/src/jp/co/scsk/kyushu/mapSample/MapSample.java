package jp.co.scsk.kyushu.mapSample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapSample {

	public static void main(String args[]) {
		putSample();
		putAllSample();
		getSample();
		clearSample();
		removeSample();
		sizeSample();
		isEmptySample();
		containsKeySample();
		containsValueSample();
		keySetSample();
		valuesSample();
		loopMapSample();
	}

	private static void putSample() {
		System.out.println("--- putSample ---");
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(Integer.valueOf(1), "AAA");
		map.put(Integer.valueOf(2), "BBB");
		map.put(Integer.valueOf(3), "CCC");
		for (Integer key : map.keySet()) {
			System.out.println(key + " : " + map.get(key));
		}
	}

	private static void putAllSample() {
		System.out.println("--- putAllSample ---");
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(Integer.valueOf(1), "AAA");
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(Integer.valueOf(2), "BBB");
		map2.put(Integer.valueOf(3), "CCC");
		map1.putAll(map2);
		for (Integer key : map1.keySet()) {
			System.out.println(key + " : " + map1.get(key));
		}
	}

	private static void getSample() {
		System.out.println("--- getSample ---");
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(Integer.valueOf(1), "AAA");
		map.put(Integer.valueOf(2), "BBB");
		map.put(Integer.valueOf(3), "CCC");
		System.out.println(map.get(Integer.valueOf(2)));
	}

	private static void clearSample() {
		System.out.println("--- clearSample ---");
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(Integer.valueOf(1), "AAA");
		map.put(Integer.valueOf(2), "BBB");
		System.out.println("mapのサイズは" + map.size());
		map.clear();
		System.out.println("mapのサイズは" + map.size());
	}

	private static void removeSample() {
		System.out.println("--- removeSample ---");
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(Integer.valueOf(1), "AAA");
		map.put(Integer.valueOf(2), "BBB");
		System.out.println("mapのサイズは" + map.size());
		map.remove(Integer.valueOf(1));
		System.out.println("mapのサイズは" + map.size());
	}

	private static void sizeSample() {
		System.out.println("--- sizeSample ---");
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		System.out.println("mapのサイズは" + map.size());
		map.put(Integer.valueOf(1), "AAA");
		map.put(Integer.valueOf(2), "BBB");
		map.put(Integer.valueOf(3), "CCC");
		System.out.println("mapのサイズは" + map.size());
	}

	private static void isEmptySample() {
		System.out.println("--- isEmptySample ---");
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		if (map.isEmpty()) {
			System.out.println("mapoは空です");
		} else {
			System.out.println("mapoは空ではありません");
		}
		map.put(Integer.valueOf(1), "AAA");
		map.put(Integer.valueOf(2), "BBB");
		if (map.isEmpty()) {
			System.out.println("mapoは空です");
		} else {
			System.out.println("mapoは空ではありません");
		}
	}

	private static void containsKeySample() {
		System.out.println("--- containsKeySample ---");
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(Integer.valueOf(1), "AAA");
		map.put(Integer.valueOf(2), "BBB");
		map.put(Integer.valueOf(3), "CCC");
		System.out.println(map.containsKey(Integer.valueOf(2)));
	}

	private static void containsValueSample() {
		System.out.println("--- containsValueSample ---");
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(Integer.valueOf(1), "AAA");
		map.put(Integer.valueOf(2), "BBB");
		map.put(Integer.valueOf(3), "CCC");
		System.out.println(map.containsValue("BBB"));
	}

	private static void keySetSample() {
		System.out.println("--- keySetSample ---");
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(Integer.valueOf(1), "AAA");
		map.put(Integer.valueOf(2), "BBB");
		map.put(Integer.valueOf(3), "CCC");
		Set<Integer> set = map.keySet();
		System.out.println(set.toString());
	}

	private static void valuesSample() {
		System.out.println("--- valuesSample ---");
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(Integer.valueOf(1), "AAA");
		map.put(Integer.valueOf(2), "BBB");
		map.put(Integer.valueOf(3), "CCC");
		Collection<String> list = map.values();
		// -- 上記か下記の方法で取得する
		ArrayList<String> list2 = new ArrayList<String>();
		list2.addAll(map.values());
		// --
		System.out.println(list.toString());
	}

	private static void loopMapSample() {
		System.out.println("--- loopMapSample ---");
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(Integer.valueOf(1), "AAA");
		map.put(Integer.valueOf(2), "BBB");
		map.put(Integer.valueOf(3), "CCC");
		for (Integer key : map.keySet()) {
			System.out.println(map.get(key));
		}
	}

}
