package jp.co.scsk.kyushu.etc;

public class Exercise02 {

	public static void main(String[] args) {
		int arraylong = 5;
		int array[] = create(arraylong);
		double arrayAvg = getAvg(array);
		System.out.println(arrayAvg);
	}

	public static int[] create(int arraylong) {
		int[] array;
		array = new int[arraylong];
		for (int i = 0; i < arraylong; i++) {
			array[i] = (int) (Math.random() * 100) + 1;
		}
		return array;
	}

	public static double getAvg(int array[]) {
		double arrayAvg = 0;
		for (int i = 0; i < array.length; i++) {
			arrayAvg += array[i];
		}
		return arrayAvg / array.length;
	}
}
