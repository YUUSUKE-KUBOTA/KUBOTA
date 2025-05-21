package jp.co.scsk.kyushu.arraySample;

public class ArraySample5 {

	public static void main(String[] args) {
		int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for (int index = 0; index < array.length; index++) {
			array[index] *= 2;
		}
		for (int element : array) {
			System.out.println(element);
		}
	}

}
