package jp.co.scsk.kyushu.exBasic;

public class Moneys {

	private int oneYen;
	private int fiveYen;
	private int tenYen;
	private int fiftyYen;
	private int oneHundredYen;
	private int fiveHundredYen;
	private int oneThousandYen;
	private int twoThousandYen;
	private int fiveThousandYen;;
	private int tenThousandYen;

	public int getOneYen() {
		return oneYen;
	}

	public int getFiveYen() {
		return fiveYen;
	}

	public int getTenYen() {
		return tenYen;
	}

	public int getFiftyYen() {
		return fiftyYen;
	}

	public int getOneHundredYen() {
		return oneHundredYen;
	}

	public int getFiveHundredYen() {
		return fiveHundredYen;
	}

	public int getOneThousandYen() {
		return oneThousandYen;
	}

	public int getTwoThousandYen() {
		return twoThousandYen;
	}

	public int getFiveThousandYen() {
		return fiveThousandYen;
	}

	public int getTenThousandYen() {
		return tenThousandYen;
	}

	public void setOneYen(int oneYen) {
		this.oneYen = oneYen;
	}

	public void setFiveYen(int fiveYen) {
		this.fiveYen = fiveYen;
	}

	public void setTenYen(int tenYen) {
		this.tenYen = tenYen;
	}

	public void setFiftyYen(int fiftyYen) {
		this.fiftyYen = fiftyYen;
	}

	public void setOneHundredYen(int oneHundredYen) {
		this.oneHundredYen = oneHundredYen;
	}

	public void setFiveHundredYen(int fiveHundredYen) {
		this.fiveHundredYen = fiveHundredYen;
	}

	public void setOneThousandYen(int oneThousandYen) {
		this.oneThousandYen = oneThousandYen;
	}

	public void setTwoThousandYen(int twoThousandYen) {
		this.twoThousandYen = twoThousandYen;
	}

	public void setFiveThousandYen(int fiveThousandYen) {
		this.fiveThousandYen = fiveThousandYen;
	}

	public void setTenThousandYen(int tenThousandYen) {
		this.tenThousandYen = tenThousandYen;
	}

	public boolean addOneYen(int num) {
		boolean answer = true;
		for (int i = 0; i < num; i++) {
			this.oneYen++;
		}
		for (int i = 0; i > num; i++) {
			this.oneYen--;
		}
		if (this.oneYen < 0) {
			answer = false;
		}
		return answer;
	}

	public boolean addFiveYen(int num) {
		boolean answer = true;
		for (int i = 0; i < num; i++) {
			this.fiveYen++;
		}
		for (int i = 0; i > num; i++) {
			this.fiveYen--;
		}
		if (this.fiveYen < 0) {
			answer = false;
		}
		return answer;
	}

	public boolean addTenYen(int num) {
		boolean answer = true;
		for (int i = 0; i < num; i++) {
			this.tenYen++;
		}
		for (int i = 0; i > num; i++) {
			this.tenYen--;
		}
		if (this.tenYen < 0) {
			answer = false;
		}
		return answer;
	}

	public boolean addFiftyYen(int num) {
		boolean answer = true;
		for (int i = 0; i < num; i++) {
			this.fiftyYen++;
		}
		for (int i = 0; i > num; i++) {
			this.fiftyYen--;
		}
		if (this.fiftyYen < 0) {
			answer = false;
		}
		return answer;
	}

	public boolean addOneHundredYen(int num) {
		boolean answer = true;
		for (int i = 0; i < num; i++) {
			this.oneHundredYen++;
		}
		for (int i = 0; i > num; i++) {
			this.oneHundredYen--;
		}
		if (this.oneHundredYen < 0) {
			answer = false;
		}
		return answer;
	}

	public boolean addFiveHundredYen(int num) {
		boolean answer = true;
		for (int i = 0; i < num; i++) {
			this.fiveHundredYen++;
		}
		for (int i = 0; i > num; i++) {
			this.fiveHundredYen--;
		}
		if (this.fiveHundredYen < 0) {
			answer = false;
		}
		return answer;
	}

	public boolean addOneThousandYen(int num) {
		boolean answer = true;
		for (int i = 0; i < num; i++) {
			this.oneThousandYen++;
		}
		for (int i = 0; i > num; i++) {
			this.oneThousandYen--;
		}
		if (this.oneThousandYen < 0) {
			answer = false;
		}
		return answer;
	}

	public boolean addTwoThousandYen(int num) {
		boolean answer = true;
		for (int i = 0; i < num; i++) {
			this.twoThousandYen++;
		}
		for (int i = 0; i > num; i++) {
			this.twoThousandYen--;
		}
		if (this.twoThousandYen < 0) {
			answer = false;
		}
		return answer;
	}

	public boolean addFiveThousandYen(int num) {
		boolean answer = true;
		for (int i = 0; i < num; i++) {
			this.fiveThousandYen++;
		}
		for (int i = 0; i > num; i++) {
			this.fiveThousandYen--;
		}
		if (this.fiveThousandYen < 0) {
			answer = false;
		}
		return answer;
	}

	public boolean addTenThousandYen(int num) {
		boolean answer = true;
		for (int i = 0; i < num; i++) {
			this.tenThousandYen++;
		}
		for (int i = 0; i > num; i++) {
			this.tenThousandYen--;
		}
		if (this.tenThousandYen < 0) {
			answer = false;
		}
		return answer;
	}

	public int getTotalMoney() {
		int sum = 0;
		sum += this.oneYen * 1;
		sum += this.fiveYen * 5;
		sum += this.tenYen * 10;
		sum += this.fiftyYen * 50;
		sum += this.oneHundredYen * 100;
		sum += this.fiveHundredYen * 500;
		sum += this.oneThousandYen * 1000;
		sum += this.twoThousandYen * 2000;
		sum += this.fiveThousandYen * 5000;
		sum += this.tenThousandYen * 10000;
		return sum;
	}

	public void clear() {
		this.oneYen = 0;
		this.fiveYen = 0;
		this.tenYen = 0;
		this.fiftyYen = 0;
		this.oneHundredYen = 0;
		this.fiveHundredYen = 0;
		this.oneThousandYen = 0;
		this.twoThousandYen = 0;
		this.fiveThousandYen = 0;
		this.tenThousandYen = 0;
	}
}
