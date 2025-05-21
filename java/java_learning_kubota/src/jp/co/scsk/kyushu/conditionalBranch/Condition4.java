package jp.co.scsk.kyushu.conditionalBranch;

public class Condition4 {

	public static void main(String[] args) {
		int prize = 2;
		System.out.println("抽選結果は。。。");
		switch (prize) {
		case 1:
			System.out.println("豪華客船世界１週旅行です！！");
			break;
		case 2:
			System.out.println("国内温泉旅行ペア宿泊券です！");
			break;
		case 3:
			System.out.println("電動自転車です");
			break;
		default:
			System.out.println("ハズレです。。。");
		}
	}

}
