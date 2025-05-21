package jp.co.scsk.kyushu.no2;

public class Lamda {

	public static void main(String[] args) {
		Runnable runner = () -> {
			System.out.println("Runnable!");
		};
		runner.run();
	}

}
