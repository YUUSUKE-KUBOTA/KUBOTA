package jp.co.scsk.kyushu.exBasic;

public class Drink {
	private String productName;
	private int quantity;
	private int price;

	Drink(String productName, int quantity, int price) {
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
	}

	public String getProductName() {
		return productName;
	}

	public int getPrice() {
		return price;
	}
}
