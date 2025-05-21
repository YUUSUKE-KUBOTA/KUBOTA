package jp.co.scsk.kyushu.no2;

public class AnonymousClass {

	public static void main(String[] args) {
		Runnable runner = new Runnable() {
			public void run() {
				System.out.println("Runnable!");
			}
		};
		runner.run();
	}

}
