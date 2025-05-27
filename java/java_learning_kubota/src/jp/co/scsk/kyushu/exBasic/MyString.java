package jp.co.scsk.kyushu.exBasic;

public class MyString {

	public void beep(int bee) {
		for (int i = 0; i <= bee; i++) {
			System.out.println("ビーーー");
		}
	}

	public void branch(int num) {
		switch (num) {
		case 1:
			System.out.println("おはようございます");
			break;
		case 2:
			System.out.println("こんにちは");
			break;
		case 3:
			System.out.println("こんばんは");
			break;
		case 4:
			System.out.println("おやすみなさい");
			break;
		case 5:
			System.out.println("また明日");
			break;
		default:
			System.out.println("さようなら");
			break;
		}
	}

	public String concat(String[] array) {
		String str1 = array[0];
		for (int i = 1; i < array.length; i++) {
			String str2 = array[i];
			str1.concat(str2);
		}
		return str1;
	}

	public String replace(String str) {
		return str.replace(",", "	");
	}
}
