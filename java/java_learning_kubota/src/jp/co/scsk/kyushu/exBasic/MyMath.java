package jp.co.scsk.kyushu.exBasic;

public class MyMath {

	public int calcPlus(int num1, int num2) {
		int result = 0;
		result = num1 + num2;
		return result;
	}

	public int calcMinus(int num1, int num2) {
		int result = 0;
		result = num1 - num2;
		return result;
	}

	public int calcTime(int num1, int num2) {
		int result = 0;
		for (int i = 1; i <= num2; i++) {
			result += calcPlus(num1, num2) - num2;
		}
		return result;
	}

	public int calcDiv(int num1, int num2) {
		int result = 0;
		result = num1 / num2;
		return result;
	}

	public int calcMod(int num1, int num2) {
		int result = 0;
		result = num1 - (calcDiv(num1, num2) * num2);
		return result;
	}

	public int calcSum(int... num) {
		int result = 0;
		for (int ex : num) {
			result += ex;
		}
		return result;
	}

	public double calcAvg(int... num) {
		double result = 0;
		int i = 0;
		for (double ex : num) {
			result += ex;
			i++;
		}
		return result /= i;
	}

	public int countUpSum1(int num1, int num2) {
		int result = 0;
		for (; num1 <= num2; num1++) {
			result += num1;
		}
		return result;
	}

	public int countUpSum2(int num1, int num2) {
		int result = 0;
		while (num1 <= num2) {
			result += num1;
			num1++;
		}
		return result;
	}
	
	public int countUpSum3(int num1, int num2) {
		int result = 0;
		do {
			result += num1;
			num1++;
		}while(num1 <= num2);
		return result;
	}
	
	public int calc(int num1, int num2, int num3) {
		switch (num1) {
		case 1:
			return calcPlus(num2, num3);
		case 2:
			return calcMinus(num2, num3);
		case 3:
			return calcTime(num2, num3);
		case 4:
			return calcDiv(num2, num3);
		case 5:
			return calcDiv(num2, num3);
		default:
			return -1;
		}
	}
	
	public int max(int... num) {
		int max = Integer.MIN_VALUE;
		for (int number : num) {
			if(max < number) {
				max = number;
			}
		}
		return max;
	}
	
	public int min(int... num) {
		int min = Integer.MAX_VALUE;
		for (int number : num) {
			if(min > number) {
				min = number;
			}
		}
		return min;
	}
	
	public int calc2(int... num) {
		int result = 0;
		if (num.length == 0) {
			return result;
		}
		switch (num[0]) {
		case 1:
			for (int number : num) {
				result += number;
			}
			return result;
		case 2:
			for (int number : num) {
				result += number;
			}
			return result /= num.length;
		case 3:
			int max = num[0];
			for (int number : num) {
				if (max < number) {
					max = number;
				}
			}
			return max;
		case 4:
			int min = num[0];
			for (int number : num) {
				if (min > number) {
					min = number;
				}
			}
			return min;
		default:
			return result - 1;
		}
	}
	
	public void round4(double num) {
		num += 0.6;
		int result = (int) num;
	}
	
	public void round6(double num) {
		num += 0.4;
		int result = (int) num;
	}
}
