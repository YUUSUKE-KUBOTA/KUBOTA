package jp.co.scsk.kyushu.exBasic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VendingMachines {

	private Moneys haveMoney;
	private Map<Drink, Integer> kindCount = new HashMap<>();
	private Moneys putMoney;

	public static void main(String[] args) {
		VendingMachines vendingMachine = new VendingMachines();
		//どの飲み物がどのくらいの数はいってるか
		vendingMachine.kindCount = new HashMap<>();
		
		//ドリンクのリストをインプット
		List<Drink> drinkList = new ArrayList<>(); 
		drinkList = DrinkList();
		
		//個数をもたせる
		for (Drink drink : drinkList) {
			vendingMachine.kindCount.put(drink, 10);
		}
		
		//お金たちをインプット
		Moneys haveMoney = new Moneys();
		haveMoney.setOneYen(10);
		haveMoney.setFiveYen(10);
		haveMoney.setTenYen(10);
		haveMoney.setFiftyYen(10);
		haveMoney.setOneHundredYen(10);
		haveMoney.setFiveHundredYen(10);
		haveMoney.setOneThousandYen(10);
		haveMoney.setTwoThousandYen(10);
		haveMoney.setFiveThousandYen(1);
		haveMoney.setTenThousandYen(1);
		
		Moneys money = PutMoney();
		Moneys change = vendingMachine.boughtDrink(money);
		//おつり分を自販機からなくす
		vendingMachine.haveMoney.addOneYen(vendingMachine.putMoney.getOneYen() - money.getOneYen());
		vendingMachine.haveMoney.addFiveYen(vendingMachine.putMoney.getFiveYen() - money.getFiveYen());
		vendingMachine.haveMoney.addTenYen(vendingMachine.putMoney.getTenYen() - money.getTenYen());
		vendingMachine.haveMoney.addFiftyYen(vendingMachine.putMoney.getFiftyYen() - money.getFiftyYen());
		vendingMachine.haveMoney.addOneHundredYen(vendingMachine.putMoney.getOneHundredYen() - money.getOneHundredYen());
		vendingMachine.haveMoney.addFiveHundredYen(vendingMachine.putMoney.getFiveHundredYen() - money.getFiveHundredYen());
		vendingMachine.haveMoney.addOneThousandYen(vendingMachine.putMoney.getOneThousandYen() - money.getOneThousandYen());
		vendingMachine.haveMoney.addTwoThousandYen(vendingMachine.putMoney.getTwoThousandYen() - money.getTwoThousandYen());
		vendingMachine.haveMoney.addFiveThousandYen(vendingMachine.putMoney.getFiveThousandYen() - money.getFiveThousandYen());
		vendingMachine.haveMoney.addTenThousandYen(vendingMachine.putMoney.getTenThousandYen() - money.getTenThousandYen());
		vendingMachine.putMoney.clear();
		
		vendingMachine.kindCount.remove(drinkList.get(0));
//		vendingMachine.kindCount.put(drink, last - 1);
		
		vendingMachine.haveMoney.addOneYen(vendingMachine.putMoney.getOneYen());
		vendingMachine.haveMoney.addFiveYen(vendingMachine.putMoney.getFiveYen());
		vendingMachine.haveMoney.addTenYen(vendingMachine.putMoney.getTenYen());
		vendingMachine.haveMoney.addFiftyYen(vendingMachine.putMoney.getFiftyYen());
		vendingMachine.haveMoney.addOneHundredYen(vendingMachine.putMoney.getOneHundredYen());
		vendingMachine.haveMoney.addFiveHundredYen(vendingMachine.putMoney.getFiveHundredYen());
		vendingMachine.haveMoney.addOneThousandYen(vendingMachine.putMoney.getOneThousandYen());
		vendingMachine.haveMoney.addTwoThousandYen(vendingMachine.putMoney.getTwoThousandYen());
		vendingMachine.haveMoney.addFiveThousandYen(vendingMachine.putMoney.getFiveThousandYen());
		vendingMachine.haveMoney.addTenThousandYen(vendingMachine.putMoney.getTenThousandYen());
		
		System.out.println(change);
	}
	
	//入れたお金
	public static Moneys PutMoney() {
		Moneys putMoney = new Moneys();
		putMoney.setOneYen(0);
		putMoney.setFiveYen(0);
		putMoney.setTenYen(0);
		putMoney.setFiftyYen(4);
		putMoney.setOneHundredYen(0);
		putMoney.setFiveHundredYen(0);
		putMoney.setOneThousandYen(1);
		putMoney.setTwoThousandYen(0);
		putMoney.setFiveThousandYen(0);
		putMoney.setTenThousandYen(0);
		return putMoney;
	}
	
	public static List<Drink> DrinkList(){
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
		Moneys haveMoney = PutMoney();
		for (Drink drink : DrinkList()) {
			if ((!(haveMoney.getTenYen() > 4)) && (!(haveMoney.getOneHundredYen() > 4))) {
				break;
			}
			if (drink.getPraice() < putMoney.getTotalMoney()) {
				canBuyDrinkList.add(drink);
			}
		}
		return canBuyDrinkList;
	}

	public int calcChange(Drink buyDrink) {
		int putMoneyTotal = PutMoney().getTotalMoney();
		return putMoneyTotal - buyDrink.getPraice();
	}
	
	public Moneys getChange(int change) {
		Moneys money = new Moneys();
		int i = 0;
		while(change % 5000 >= 0) {
			change -= 5000;
			i++;
		}
		money.setFiveThousandYen(i);
		i = 0;
		while(change % 2000 >= 0) {
			change -= 2000;
			i++;
		}
		money.setTwoThousandYen(i);
		i = 0;
		while(change % 1000 >= 0) {
			change -= 1000;
			i++;
		}
		money.setOneThousandYen(i);
		i = 0;
		while(change % 500 >= 0) {
			change -= 500;
			i++;
		}
		money.setFiveHundredYen(i);
		i = 0;
		while(change % 100 >= 0) {
			change -= 100;
			i++;
		}
		money.setOneHundredYen(i);
		i = 0;
		while(change % 50 >= 0) {
			change -= 50;
			i++;
		}
		money.setFiftyYen(i);
		i = 0;
		while(change % 10 >= 0) {
			change -= 10;
			i++;
		}
		money.setTenYen(i);
		i = 0;
		while(change % 5 >= 0) {
			change -= 5;
			i++;
		}
		money.setFiveYen(i);
		i = 0;
		while(change % 1 >= 0) {
			change -= 1;
			i++;
		}
		money.setOneYen(i);
		return money;
	}
	
	public Moneys boughtDrink(Moneys money) {
		VendingMachines vendingMachine = new VendingMachines();
		//買えるドリンク
		List<Drink> canBuyDrinkList = vendingMachine.insertMoneys(money);
		//どのドリンク買うか
		Drink buyDrink = canBuyDrinkList.get(0);
		//おつり計算してるけど自販機の中に入ってる数の計算してない
		int change = vendingMachine.calcChange(buyDrink);
		//おつりで何が何個返せばいいか
		Moneys changes = vendingMachine.getChange(change);
		
		System.out.println(buyDrink.getProductName());

		return changes;
	}
}