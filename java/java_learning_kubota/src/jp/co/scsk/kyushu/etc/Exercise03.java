package jp.co.scsk.kyushu.etc;

import java.util.ArrayList;
import java.util.List;

public class Exercise03 {

	public static void main(String[] args) {
		List<Human> humanList = createHuman(15);
		for (Human human : humanList) {
			System.out.println("名前は" + human.getName() + "です。年齢は" + human.getAge() + "歳です。");
		}
		Human[] humanArray = humanList.toArray(new Human[0]);
		for (int i = 0; i < humanArray.length; i++) {
			System.out
					.println((i + 1) + "番目：名前は" + humanArray[i].getName() + "です。年齢は" + humanArray[i].getAge() + "歳です。");
		}
	}

	private static List<Human> createHuman(int num) {
		List<Human> humanList = new ArrayList<>();
		for (int i = 0; i < num; i++) {
			String name = NameUtil.createName();
			int age = (int) (Math.random() * 100) + 1;
			Human human = new Human(name, age);
			humanList.add(human);
		}
		return humanList;
	}
}