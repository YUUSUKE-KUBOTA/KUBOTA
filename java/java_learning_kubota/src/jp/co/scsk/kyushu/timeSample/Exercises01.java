package jp.co.scsk.kyushu.timeSample;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Exercises01 {

	public static void main(String[] args) {
	        // 初期の日付を設定
	        LocalDate startDate = LocalDate.of(2023, 5, 27);
	        
	        // 365日後の日付を計算
	        LocalDate futureDate = startDate.plusDays(365);
	        
	        // 日付をフォーマット
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
	        String formattedDate = futureDate.format(formatter);
	        
	        // 結果を出力
	        System.out.println(formattedDate);
	}
}
