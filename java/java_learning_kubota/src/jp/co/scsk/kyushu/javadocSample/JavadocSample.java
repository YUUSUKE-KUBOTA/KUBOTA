package jp.co.scsk.kyushu.javadocSample;

/**
 * Javadocのサンプルです。
 */
public class JavadocSample {

	/**
	 * 引数の文字列の長さを返します
	 * @param str 検査対象の文字列
	 * @return 検査対象の文字列の長さ
	 * @throws NullPointerException str == nullの場合に発生します
	 */
	public int length(String str) throws NullPointerException {
		return str.length();
	}
}
