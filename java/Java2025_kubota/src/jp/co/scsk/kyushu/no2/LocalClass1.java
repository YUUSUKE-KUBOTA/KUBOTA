package jp.co.scsk.kyushu.no2;

public class LocalClass1 {

	public static void main(String[] args) {
		LocalClass1 lc = new LocalClass1();
		lc.main();
	}

	private void main() {
		hellosWorld();
		Local l = new Local();
		l.helloWorld();
	}

	private void hellosWorld() {
		System.out.println("Hello world!");
	}

	class Local {
		private void helloWorld() {
			System.out.println("hello Japan!");
		}
	}

}
