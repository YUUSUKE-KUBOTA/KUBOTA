package jp.co.scsk.kyushu.conditionalBranch;

public class Condition2 {

	public static void main(String[] args) {
		int price = 1000;
		int money = 1100;
		if (money > price) {
		    System.out.println("おつりは" + (money - price) + "円です" );
		} else if (money == price) {
		    System.out.println("おつりはありません" );
		} else {
		    System.out.println((price - money) + "円不足しています" );
		}
	}

}
