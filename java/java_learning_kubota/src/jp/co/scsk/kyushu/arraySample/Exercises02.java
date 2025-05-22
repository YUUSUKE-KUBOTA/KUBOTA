package jp.co.scsk.kyushu.arraySample;

public class Exercises02 {
	public static void main(String[] args) {
		int array1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] array2;
		array2 = new int[10];
		for (int i = 0; i < 10; i++) {
			array2[9 - i] = array1[i];
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(array2[i]);
		}
	}
}