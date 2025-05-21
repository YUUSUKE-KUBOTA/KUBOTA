package jp.co.scsk.kyushu.model;

public class Score {
	/** 国語 */
	private int japanese;
	/** 数学 */
	private int math;
	/** 英語 */
	private int english;

	public Score() {
		this.japanese = 0;
		this.math = 0;
		this.english = 0;
	}

	public Score(int japanese, int math, int english) {
		this.japanese = japanese;
		this.math = math;
		this.english = english;
	}

	public int getJapanese() {
		return japanese;
	}
	public void setJapanese(int japanese) {
		this.japanese = japanese;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
}
