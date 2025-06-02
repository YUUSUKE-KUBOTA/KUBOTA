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
		vendingMachine.haveMoney.addTwoThousandYen(vendingMachine.putMoney.getTwoThousandYen());
		vendingMachine.haveMoney.addFiveThousandYen(vendingMachine.putMoney.getFiveThousandYen());
		vendingMachine.haveMoney.addTenThousandYen(vendingMachine.putMoney.getTenThousandYen());
		
		//入れたお金の種類おつりがかえってくる
		Moneys money = vendingMachine.getChange(change);
		vendingMachine.putMoney.clear();
		
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
	
	//自販機のお金
	public static Moneys HaveMoney() {
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
		return haveMoney;
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
		VendingMachines vendingMachine = new VendingMachines();
		Moneys money = new Moneys();
		int i = 0;
		while(change % 5000 >= 0) {
			i++;
		}
		money.setFiveThousandYen(i);
		i = 0;
		while(change % 2000 >= 0) {
			i++;
		}
		money.setTwoThousandYen(i);
		i = 0;
		while(change % 1000 >= 0) {
			i++;
		}
		money.setOneThousandYen(i);
		i = 0;
		while(change % 500 >= 0) {
			i++;
		}
		money.setFiveHundredYen(i);
		i = 0;
		while(change % 100 >= 0) {
			i++;
		}
		money.setOneHundredYen(i);
		i = 0;
		while(change % 50 >= 0) {
			i++;
		}
		money.setFiftyYen(i);
		i = 0;
		while(change % 10 >= 0) {
			i++;
		}
		money.setTenYen(i);
		i = 0;
		while(change % 5 >= 0) {
			i++;
		}
		money.setFiveYen(i);
		i = 0;
		while(change % 1 >= 0) {
			i++;
		}
		money.setOneYen(i);
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
		return money;
	}
	
	public Moneys boughtDrink(Moneys money) {
		VendingMachines vendingMachine = new VendingMachines();
		
		//ドリンクダウンロード
		List<Drink> drinkList = new ArrayList<>(); 
		drinkList = vendingMachine.DrinkList();
		//買えるドリンク
		List<Drink> canBuyDrinkList = vendingMachine.insertMoneys(money);
		//どのドリンク買うか
		Drink buyDrink = canBuyDrinkList.get(0);
		
		int change = vendingMachine.calcChange(buyDrink);
		int last = vendingMachine.kindCount.get(drinkList.get(0));
		vendingMachine.kindCount.remove(drinkList.get(0));
		vendingMachine.kindCount.put(buyDrink, last - 1);
		
		System.out.println();
	}
}