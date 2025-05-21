package jp.co.scsk.kyushu.no1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegSample {

	public static void main(String[] args) {
		// 判定対象の文字列
		String targetStr = "n53n";
		// 判定するパターン生成
		Pattern pattern1 = Pattern.compile("[0-9]");
		Pattern pattern2 = Pattern.compile("[A-Z]");
		Matcher matcher1 = pattern1.matcher(targetStr);
		Matcher matcher2 = pattern2.matcher(targetStr);

		// 画面表示
		System.out.println(matcher1.find());
		System.out.println(matcher2.find());
	}

}
