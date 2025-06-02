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
		//定義
		VendingMachines vendingMachine = new VendingMachines();
		List<Drink> canBuyDrinkList = new ArrayList<>(); 
		vendingMachine.putMoney = new Moneys();
		vendingMachine.haveMoney = new Moneys();
		vendingMachine.kindCount = new HashMap<>();
		
		//ドリンクのリストをインプット
		List<Drink> drinkList = new ArrayList<>(); 
		drinkList = vendingMachine.DrinkList();
		
		//個数をもたせる
		for (Drink drink : drinkList) {
			vendingMachine.kindCount.put(drink, 10);
		}
		
		//お金たちをインプット
		vendingMachine.haveMoney = vendingMachine.HaveMoney();
		vendingMachine.putMoney = vendingMachine.PutMoney();
		
		//入れたお金で買えるドリンクのリストを表示させる。
		canBuyDrinkList = vendingMachine.insertMoneys(vendingMachine.putMoney);
		
		//買ったドリンクの指定と、そのおつり、残りの本数
		Drink buyDrink = canBuyDrinkList.get(0);
		int change = vendingMachine.calcChange(buyDrink);
		int last = vendingMachine.kindCount.get(drinkList.get(0));
		vendingMachine.kindCount.remove(drinkList.get(0));
		vendingMachine.kindCount.put(buyDrink, last - 1);
		
		vendingMachine.haveMoney.addOneYen(vendingMachine.putMoney.getOneYen());
		vendingMachine.haveMoney.addFiveYen(vendingMachine.putMoney.getFiveYen());
		vendingMachine.haveMoney.addTenYen(vendingMachine.putMoney.getTenYen());
		vendingMachine.haveMoney.addFiftyYen(vendingMachine.putMoney.getFiftyYen());
		vendingMachine.haveMoney.addOneHundredYen(vendingMachine.putMoney.getOneHundredYen());
		vendingMachine.haveMoney.addFiveHundredYen(vendingMachine.putMoney.getFiveHundredYen());
		vendingMachine.haveMoney.addOneThousandYen(vendingMachine.putMoney.getOneThousandYen());
		vendingMachine.haveMoney.addFiveThousandYen(vendingMachine.putMoney.getFiveThousandYen());
		vendingMachine.haveMoney.addTenThousandYen(vendingMachine.putMoney.getTenThousandYen());

		
		//入れたお金の種類
		Moneys a = vendingMachine.getChange(change);
		vendingMachine.putMoney.clear();
		
		
	}
	
	public Moneys PutMoney() {
		Moneys putMoney = new Moneys();
		putMoney.setOneYen(1);
		putMoney.setFiveYen(1);
		putMoney.setTenYen(1);
		putMoney.setFiftyYen(1);
		putMoney.setOneHundredYen(1);
		putMoney.setFiveHundredYen(1);
		putMoney.setOneThousandYen(1);
		putMoney.setFiveThousandYen(1);
		putMoney.setTenThousandYen(1);
		return putMoney;
	}
	
	public Moneys HaveMoney() {
		Moneys haveMoney = new Moneys();
		haveMoney.setOneYen(1);
		haveMoney.setFiveYen(1);
		haveMoney.setTenYen(1);
		haveMoney.setFiftyYen(1);
		haveMoney.setOneHundredYen(1);
		haveMoney.setFiveHundredYen(1);
		haveMoney.setOneThousandYen(1);
		haveMoney.setFiveThousandYen(1);
		haveMoney.setTenThousandYen(1);
		return haveMoney;
	}
	
	public List<Drink> DrinkList(){
		List<Drink> drinkList = new ArrayList<>();
		Drink drink1 = new Drink("ファンタ", 500, 180);
		Drink drink2 = new Drink("三ツ矢サイダー", 500, 160);
		Drink drink3 = new Drink("ファイヤ", 100, 100);
		Drink drink4 = new Drink("レッドブル", 250, 300);
		drinkList.add(drink1);
		drinkList.add(drink2);
		drinkList.add(drink3);
		drinkList.add(drink4);
		return drinkList; 
	}

	public List<Drink> insertMoneys(Moneys putMoney) {
		List<Drink> canBuyDrinkList = new ArrayList<>();
		VendingMachines vendingMachine = new VendingMachines();
		for (Drink drink : vendingMachine.DrinkList()) {
			if (drink.getPraice() < putMoney.getTotalMoney()) {
				canBuyDrinkList.add(drink);
			}
		}
		return canBuyDrinkList;
	}

	public int calcChange(Drink buyDrink) {
		VendingMachines vendingMachine = new VendingMachines();
		int putMoneyTotal = vendingMachine.PutMoney().getTotalMoney();
		return putMoneyTotal - buyDrink.getPraice();
	}
	
	public Moneys getChange(int change) {
		
		if (change % 10000 > 1) {
			
		}
		
		Moneys a;
		
		
		return a;
	}
}