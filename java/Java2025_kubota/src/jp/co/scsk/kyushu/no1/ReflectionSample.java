package jp.co.scsk.kyushu.no1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectionSample {

	public static void main(String[] args) {
		// クラス名
		String className = "jp.co.scsk.kyushu.model.Human";
		// メソッド名
		String methodName1 = "setName";
		String methodName2 = "getName";
		// テスト用変数
		String name = "博多太郎";

		try {
			// クラスの取得
			Class<?> c = Class.forName(className);
			// インスタンスの生成
			Constructor<?> obj = c.getConstructor();
			// メソッドの取得
			Method m1 = c.getMethod(methodName1, String.class);
			Method m2 = c.getMethod(methodName2);
			// メソッドの実行
			m1.invoke(obj, name);

			System.out.println(m2.invoke(obj));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
