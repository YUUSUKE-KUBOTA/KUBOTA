package jp.co.scsk.kyushu.no1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterSample {

	public static void main(String[] args) {
		// DateTimeFormatterのインスタンス生成
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yy年M月d日 ah時m分s秒");
		//LocalDateTimeのインスタンス生成
		LocalDateTime date = LocalDateTime.parse("2020/02/18 09:25:30", formatter1);

		System.out.println(date.format(formatter1));
		System.out.println(date.format(formatter2));
	}

}
