package jp.co.scsk.kyushu.no2;

public class LocalClass2 {

	public static void main(String[] args) {
		LocalClass2 lc = new LocalClass2();
		lc.main();
	}

	private void main() {
		Runnable runner = new MyRunnable();
		runner.run();
	}

	class MyRunnable implements Runnable {
		@Override
		public void run() {
			System.out.println("Runnable!");
		}
	}

}
