package jp.co.scsk.kyushu.no1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HomeWork3_ModelAnswers {

	public static void main(String[] args) {
		// DateFormatterのインスタンス生成
		// (例) 2020/02/18
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		// (例) 18.02.20
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd.MM.yy");
		// (例) 2020年2月18日生まれ
		DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("yyyy年M月d日生まれ");
		//LocalDateTimeのインスタンス生成
		LocalDate date = LocalDate.parse("2020/02/18", formatter1);

		System.out.println(date.format(formatter1));
		System.out.println(date.format(formatter2));
		System.out.println(date.format(formatter3));
	}

}
