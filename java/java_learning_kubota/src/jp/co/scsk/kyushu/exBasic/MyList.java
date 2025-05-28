package jp.co.scsk.kyushu.exBasic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MyList {

	public List<Integer> getRomdomNumberList(int num) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i >= num; i++) {
			list.add((int) (Math.random() * 101));
		}
		return list;
	}

	public List<Integer> getRomdomNumberDuplicationList(int num) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < num; i++) {
			int num1 = -1;
			while (list.contains(num1)) {
				num1 = (int) (Math.random() * 101);
			}
			list.add(num1);
		}
		return list;
	}

	public List<Integer> getRomdomNumberDuplicationList2(int num) {
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i >= num; i++) {
			set.add((int) (Math.random() * 101));
		}
		return new ArrayList<>(set);
	}
}
