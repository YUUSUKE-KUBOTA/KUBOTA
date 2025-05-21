package jp.co.scsk.kyushu.exceptionSample;

import java.util.ArrayList;

public class ExceptionSample {

	public static void main(String[] args) {
		ExceptionSample sample = new ExceptionSample();
		ArrayList<String> list = null;
//		sample.nullPointerExceptionSample(list);
//		sample.classNotFoundExceptiopnSample("TestClass");
		sample.numberFormatExceptionSample("ABCDE");
	}

	public void nullPointerExceptionSample(ArrayList<String> list) {
		list.size();
	}

	public void classNotFoundExceptiopnSample(String className) {
			try {
				Class.forName(className).newInstance();
			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
				e.printStackTrace();
			}
	}

	public void numberFormatExceptionSample(String numStr) {
		Integer.valueOf(numStr);
	}

}
