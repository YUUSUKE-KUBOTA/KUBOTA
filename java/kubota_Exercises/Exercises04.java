package jp.co.scsk.kyushu.conditionalBranch;

public class Exercises04 {
	public static void main(String[] args) {
		int num = 2;
		if (num == 1) {
			System.out.println("おはよう");
		} else if (num == 2) {
			System.out.println("こんにちは");
			System.out.println("ご機嫌いかが？");
		} else if (num == 3) {
			System.out.println("ご機嫌いかが？");
		} else if (num == 4) {
			System.out.println("ご機嫌いかが？");
		} else {
			System.out.println("1～4を入力してください");
		}
	}
}
