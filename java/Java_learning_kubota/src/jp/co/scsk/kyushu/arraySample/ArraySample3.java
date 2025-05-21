package jp.co.scsk.kyushu.arraySample;

public class ArraySample3 {

	public static void main(String[] args) {
		int array[][] = {{11, 12, 13}, {21, 22, 23}};
		for (int[] row : array) {
			for (int element : row) {
				System.out.print(element + "\t");
			}
			System.out.print("\n");
		}
	}

}
