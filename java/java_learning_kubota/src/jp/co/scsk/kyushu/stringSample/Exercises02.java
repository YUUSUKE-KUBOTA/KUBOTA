package jp.co.scsk.kyushu.stringSample;

public class Exercises02 {

	public static void main(String[] args) {
		String str1 = "春は曙。やうやう白くなりゆく、やまぎはすこし明りて、紫だちたる雲の細くたなびきたる";
		String str2 = "夏は夜。月の頃はさらなり。闇もなほ、蛍の多く飛びちがひたる。";
		str1 = str1.replace("やうやう", "ようよう");
		str1 = str1.replace("やまぎは", "やまぎわ");
		str2 = str2.replace("ほ", "お");
		str2 = str2.replace("ひ", "い");
		System.out.println(str1);
		System.out.println(str2);
	}

}
