package jp.co.scsk.kyushu.exBasic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VendingMachines {
	
	private Moneys haveMoney;
	Map<Drink, Integer> kindCount = new HashMap<>();
	private Moneys putMoney;
	
	public static void main(String[] args) {
		putMoney = new Moneys();
		VendingMachines vendingMachines = new VendingMachines();
		List<Drink> buyCanDrinkList = vendingMachines.insertMoneys(putMoney);
	}
	
	public Moneys haveMoneys(int a) {
		this.putMoney.setOneHundredYen(1);
		this.putMoney.setFiftyYen(1);
		this.putMoney.setTenYen(3);
		return haveMoney;
	}
	
	public List<Drink> insertMoneys(Moneys putMoney){
		List<Drink> drinkList = new ArrayList<>();
		Drink drink1 = new Drink("ファンタ", 500, 180);
		Drink drink2 = new Drink("三ツ矢サイダー", 500, 160);
		Drink drink3 = new Drink("ファイヤ", 150, 100);
		Drink drink4 = new Drink("レッドブル", 250, 300);
		drinkList.add(drink1);
		drinkList.add(drink2);
		drinkList.add(drink3);
		drinkList.add(drink4);
		List<Drink> buyCanDrinkList = new ArrayList<>();
		for (int i = 0; i < drinkList.size(); i++) {
			
		}

	}
}
//		VendingMachines vendingMachines = new VendingMachines();