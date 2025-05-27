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
}
