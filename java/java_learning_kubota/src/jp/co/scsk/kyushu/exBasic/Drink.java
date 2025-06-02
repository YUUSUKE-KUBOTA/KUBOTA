package jp.co.scsk.kyushu.exBasic;

public class Drink {
	private String productName;
	private int quantity;
	private int praice;

	Drink(String productName, int quantity, int praice) {
		this.productName = productName;
		this.quantity = quantity;
		this.praice = praice;
	}

	public String getProductName() {
		return productName;
	}

	public int getPraice() {
		return praice;
	}
}
