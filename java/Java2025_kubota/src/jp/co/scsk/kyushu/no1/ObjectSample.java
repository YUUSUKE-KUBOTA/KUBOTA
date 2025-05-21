package jp.co.scsk.kyushu.no1;

import jp.co.scsk.kyushu.model.Human;

public class ObjectSample {

	public static void main(String[] args) {
		Human humanA = new Human();
		humanA.setName("山田太郎");
		humanA.setAge(25);

		// shallow copy
		Human humanB = humanA;

		// deep copy
		Human humanC = new Human();
		humanC.setName(humanA.getName());
		humanC.setAge(humanA.getAge());

		// 確認
		humanA.setName("鈴木花子");
		humanA.setAge(21);

		System.out.println("-- humanA ---");
		System.out.println(humanA.getName() + ": " + humanA.getAge());
		System.out.println("-- humanB ---");
		System.out.println(humanB.getName() + ": " + humanB.getAge());
		System.out.println("-- humanC ---");
		System.out.println(humanC.getName() + ": " + humanC.getAge());
	}

}
