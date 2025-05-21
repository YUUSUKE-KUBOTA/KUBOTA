package jp.co.scsk.kyushu.no2;

import jp.co.scsk.kyushu.myInterface.Calculation;

public class HomeWork {

	public static void main(String[] args) {
		HomeWork hw = new HomeWork();
		hw.main();
	}

	public void main() {
		Calculation sum = new Sum();
		System.out.println(sum.calc(5, 3));
		Calculation sub = new Sub();
		System.out.println(sub.calc(5, 3));
	}

	class Sum implements Calculation {
		@Override
		public double calc(int num1, int num2) {
			return num1 + num2;
		}
	}

	class Sub implements Calculation {
		@Override
		public double calc(int num1, int num2) {
			return num1 - num2;
		}
	}

}
