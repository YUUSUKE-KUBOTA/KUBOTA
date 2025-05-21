package jp.co.scsk.kyushu.exceptionSample;

public class TryCatch5 {

	public static void main(String[] args) {
		try {
			System.out.println(Integer.valueOf("ABC"));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("-- getMassage --\n" + e.getMessage());
			System.out.println("-- getClass --\n" + e.getClass());
			System.out.println("-- getStackTrace --");
			StackTraceElement[] errMsgList = e.getStackTrace();
			for (StackTraceElement stackTraceElement : errMsgList) {
				System.out.println(stackTraceElement);
			}
		}
	}

}
