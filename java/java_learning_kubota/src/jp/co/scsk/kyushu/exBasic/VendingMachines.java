package jp.co.scsk.kyushu.exBasic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VendingMachines {

	private Moneys haveMoney;
	private Map<Drink, Integer> kindCount;
	private Moneys putMoney;

	public VendingMachines(Moneys haveMoney, Map<Drink, Integer> kindCount, Moneys putMoney) {
		this.haveMoney = haveMoney;
		this.kindCount = kindCount;
		this.putMoney = putMoney;
	}

	public static void main(String[] args) {
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

		Map<Drink, Integer> kindCount = new HashMap<>();
		List<Drink> drinkList = DrinkList();
		for (Drink drink : drinkList) {
			kindCount.put(drink, 10);
		}

		Moneys putMoney = PutMoney();
		System.out.println("入れた金額は" + putMoney.getTotalMoney() + "円");

		VendingMachines vendingMachine = new VendingMachines(haveMoney, kindCount, putMoney);

		Moneys change = vendingMachine.boughtDrink(putMoney);

		vendingMachine.putMoney.clear();

		System.out.println("おつりは" + change.getTotalMoney() + "円");

		for (Drink a : kindCount.keySet()) {
			System.out.println(a.getProductName() + "の残りの本数" + kindCount.get(a) + "本");
		}
	}

	public int calcChange(Drink buyDrink) {
		int putMoneyTotal = PutMoney().getTotalMoney();
		for (Drink buy : kindCount.keySet()) {
			if (buyDrink.getProductName() == buy.getProductName()) {
				Integer beforeCount = kindCount.get(buy);
				kindCount.put(buy, beforeCount - 1);
			}
		}

		return putMoneyTotal - buyDrink.getPrice();
	}

	public static Moneys PutMoney() {
		Moneys putMoney = new Moneys();
		putMoney.setOneYen(0);
		putMoney.setFiveYen(0);
		putMoney.setTenYen(3);
		putMoney.setFiftyYen(1);
		putMoney.setOneHundredYen(3);
		putMoney.setFiveHundredYen(0);
		putMoney.setOneThousandYen(1);
		putMoney.setTwoThousandYen(0);
		putMoney.setFiveThousandYen(0);
		putMoney.setTenThousandYen(0);
		return putMoney;
	}

	public static List<Drink> DrinkList() {
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

	public Moneys boughtDrink(Moneys money) {

		List<Drink> canBuyDrinkList = insertMoneys(money);
		if (canBuyDrinkList.isEmpty()) {
			System.out.println("購入可能な飲み物がありません。");
			return money;
		}

		//買う飲み物はここで選択
		Drink buyDrink = canBuyDrinkList.get(2);

		int change = calcChange(buyDrink);

		Moneys changes = getChange(change);
		System.out.println("買った飲み物は" + buyDrink.getProductName());

		return changes;
	}

	public List<Drink> insertMoneys(Moneys putMoney) {
		List<Drink> canBuyDrinkList = new ArrayList<>();

		for (Drink drink : kindCount.keySet()) {
			//毎回リセット
			Moneys money = putMoney;
			//後で追加したままか消すか決める
			canBuyDrinkList.add(drink);
			//差額計算
			int changeValue = money.getTotalMoney() - drink.getPrice();
			//差額はいくら必要か計算
			Moneys changeCount = getChange(changeValue);
			//それぞれの枚数あるかどうか計算
			if (haveMoney.getFiveThousandYen() - changeCount.getFiveThousandYen() > 0) {
				haveMoney.setFiveThousandYen(haveMoney.getFiveThousandYen() - changeCount.getFiveThousandYen());
			} else if (haveMoney.getFiveThousandYen() - changeCount.getFiveThousandYen() < 0) {
				haveMoney.setFiveThousandYen(0);
				changeCount.setOneThousandYen(changeCount.getOneThousandYen() + (changeCount.getFiveThousandYen() * 5));
			}

			if (haveMoney.getOneThousandYen() - changeCount.getOneThousandYen() > 0) {
				haveMoney.setOneThousandYen(haveMoney.getOneThousandYen() - changeCount.getOneThousandYen());
			} else if (haveMoney.getOneThousandYen() - changeCount.getOneThousandYen() < 0) {
				haveMoney.setOneThousandYen(0);
				changeCount.setFiveHundredYen(changeCount.getFiveHundredYen() + (changeCount.getOneThousandYen() * 2));
			}

			if (haveMoney.getFiveHundredYen() - changeCount.getFiveHundredYen() > 0) {
				haveMoney.setFiveHundredYen(haveMoney.getFiveHundredYen() - changeCount.getFiveHundredYen());
			} else if (haveMoney.getFiveHundredYen() - changeCount.getFiveHundredYen() < 0) {
				haveMoney.setFiveHundredYen(0);
				changeCount.setOneHundredYen(changeCount.getOneHundredYen() + (changeCount.getFiveHundredYen() * 5));
			}

			if (haveMoney.getOneHundredYen() - changeCount.getOneHundredYen() > 0) {
				haveMoney.setOneHundredYen(haveMoney.getOneHundredYen() - changeCount.getOneHundredYen());
			} else if (haveMoney.getOneHundredYen() - changeCount.getOneHundredYen() < 0) {
				haveMoney.setOneHundredYen(0);
				changeCount.setFiftyYen(changeCount.getFiftyYen() + (changeCount.getOneHundredYen() * 2));
			}

			if (haveMoney.getFiftyYen() - changeCount.getFiftyYen() > 0) {
				haveMoney.setFiftyYen(haveMoney.getFiftyYen() - changeCount.getFiftyYen());
			} else if (haveMoney.getFiftyYen() - changeCount.getFiftyYen() < 0) {
				haveMoney.setFiftyYen(0);
				changeCount.setTenYen(changeCount.getTenYen() + (changeCount.getFiftyYen() * 5));
			}

			if (haveMoney.getTenYen() - changeCount.getTenYen() > 0) {
				haveMoney.setTenYen(haveMoney.getTenYen() - changeCount.getTenYen());
			} else if (haveMoney.getFiftyYen() - changeCount.getFiftyYen() < 0) {
				canBuyDrinkList.remove(drink);
			}

			if (kindCount.get(drink) <= 0) {
				canBuyDrinkList.remove(drink);
			}
		}
		if (canBuyDrinkList.isEmpty()) {
			System.out.println("購入可能な飲み物がありません。");
		}
		return canBuyDrinkList;
	}

	public Moneys getChange(int change) {
		Moneys money = new Moneys();
		int i = 0;
		while ((change - 5000) >= 0) {
			change -= 5000;
			i++;
		}
		money.setFiveThousandYen(i);
		i = 0;
		while ((change - 1000) >= 0) {
			change -= 1000;
			i++;
		}
		money.setOneThousandYen(i);
		i = 0;
		while ((change - 500) >= 0) {
			change -= 500;
			i++;
		}
		money.setFiveHundredYen(i);
		i = 0;
		while ((change - 100) >= 0) {
			change -= 100;
			i++;
		}
		money.setOneHundredYen(i);
		i = 0;
		while ((change - 50) >= 0) {
			change -= 50;
			i++;
		}
		money.setFiftyYen(i);
		i = 0;
		while ((change - 10) >= 0) {
			change -= 10;
			i++;
		}
		money.setTenYen(i);
		i = 0;
		while ((change - 5) >= 0) {
			change -= 5;
			i++;
		}
		money.setFiveYen(i);
		i = 0;
		while ((change - 1) >= 0) {
			change -= 1;
			i++;
		}
		money.setOneYen(i);
		return money;
	}
}