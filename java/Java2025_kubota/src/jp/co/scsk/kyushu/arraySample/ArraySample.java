package jp.co.scsk.kyushu.arraySample;

import java.text.ParseException;

public class ArraySample {

	public static void main(String[] args) throws ParseException {
		int intArray[] = {1, 2, 3, 4, 5};
		System.out.println("-- intArrayの中身 ---");
		for (int num : intArray) {
			System.out.println(num);
		}

		System.out.println("-- intArray[2] ---");
		System.out.println(intArray[2]);
		intArray[2] = 7;
		System.out.println(intArray[2]);

		for (int i = 0; i < intArray.length; i++) {
			intArray[i] *= 2;
		}

		System.out.println("-- intArrayの中身 ---");
		for (int num : intArray) {
			System.out.println(num);
		}

//		String strArray[] = {"abc", "ABC", "123"};
//		for (String str : strArray) {
//			System.out.println(str);
//		}
	}
}
