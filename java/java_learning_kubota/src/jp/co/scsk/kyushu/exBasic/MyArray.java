package jp.co.scsk.kyushu.exBasic;

public class MyArray {
	public int[] getRomdomNumberArray(int num) {
		int[] array;
		array = new int[num];
		for (int i = 0; i <= num; i++) {
			array[i] = (int) (Math.random() * 101);
		}
		return array;
	}
	
	public int[][] getMultipleResultArray(int[] array1, int[] array2) {
		int resultArray[][];
		resultArray = new int[array1.length][array2.length];
		for (int i = 0; i <= array1.length; i++) {
			for (int j = 0; j <= array2.length; j++) {
				resultArray[i][j] = array1[i] * array2[j];
			}
		}
		return resultArray;
	}
}
