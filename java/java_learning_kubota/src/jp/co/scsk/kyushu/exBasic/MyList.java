package jp.co.scsk.kyushu.exBasic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MyList {
	
	public static void main(String[] args) {
		MyList myList = new MyList();
		int x = 10;
		Sex sex1 = new Sex(Sex.MAN);
		Blood blood1 = new Blood();
		Human human1 = new Human(10, "k", sex1, blood1, 170.0, 50.0);
		Sex sex2 = new Sex(Sex.MAN);
		Blood blood2 = new Blood();
		Human human2 = new Human(20, "y", sex2, blood2, 120.0, 20.0);
		ArrayList<Human> humanList = new ArrayList<>();
		humanList.add(human1);
		humanList.add(human2);
		System.out.println(myList.getRomdomNumberList(x));
		System.out.println(myList.getRomdomNumberDuplicationList(x));
		System.out.println(myList.getRomdomNumberDuplicationList2(x));
		System.out.println(myList.calcBMI(humanList));
		myList.plusAge(humanList);
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
			double bmi = weight / (height * height) / 10000;
			bmiArray.add((Double) bmi);
		}
		return bmiArray;
	}

	public void plusAge(List<Human> humanList) {
		for (Human Element : humanList) {
			int age = Element.getAge();
			age += 1;
			System.out.println(age);
		}
	}
}
