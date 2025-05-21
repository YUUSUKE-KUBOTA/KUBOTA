package jp.co.scsk.kyushu.stringSample;

public class Exercises01 {

	public static void main(String[] args) {
	String str1 = "2019.05.28";
	String str2 = "2019年05月28日";
	str1 = str2.replace("2019.05.28","2019年05月28日");
	System.out.println(str1);
	}
}