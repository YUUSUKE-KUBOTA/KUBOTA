package jp.co.scsk.kyushu.no1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HomeWork3 {

	public static void main(String[] args) {
		// DateFormatterのインスタンス生成
		// TODO 以下の例に合うようにDateTimeFormatterを修正すること
		// (例) 2020/02/18
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("");
		// (例) 18.02.20
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("");
		// (例) 2020年2月18日生まれ
		DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("");
		//LocalDateTimeのインスタンス生成
		LocalDate date = LocalDate.parse("", formatter1);

		System.out.println(date.format(formatter1));
		System.out.println(date.format(formatter2));
		System.out.println(date.format(formatter3));
	}

}
