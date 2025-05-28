package jp.co.scsk.kyushu.exBasic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MyList {
	
	public static void main(String[] args) {
		MyList myList = new MyList();
		int x = 10;
		ArrayList<Human> human = new ArrayList<>();
		System.out.println(myList.getRomdomNumberList(x));
		System.out.println(myList.getRomdomNumberDuplicationList(x));
		System.out.println(myList.getRomdomNumberDuplicationList2(x));
		System.out.println(myList.calcBMI(human));
	}

	public List<Integer> getRomdomNumberList(int num) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < num; i++) {
			list.add((int) (Math.random() * 101));
		}
		return list;
	}

	public List<Integer> getRomdomNumberDuplicationList(int num) {
		List<Integer> list = new ArrayList<>();
	    while (list.size() < num) {
	        int num1 = (int) (Math.random() * 101);
	        if (!list.contains(num1)) {
	            list.add(num1);
	        }
	    }
	    return list;
	}

	public List<Integer> getRomdomNumberDuplicationList2(int num) {
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < num; i++) {
			set.add((int) (Math.random() * 101));
		}
		return new ArrayList<>(set);
	}

	public List<Double> calcBMI(List<Human> humanList) {
		ArrayList<Double> bmiArray = new ArrayList<>();
		for (Human Element : humanList) {
			double height = Element.getHeight();
			double weight = Element.getWeight();
			double bmi = weight / (height * height);
			bmiArray.add(bmi);
		}
		return bmiArray;
	}

	public void plusAge(List<Human> humanList) {
		for (Human Element : humanList) {
			int age = Element.getAge();
			System.out.println();
		}
	}
}
