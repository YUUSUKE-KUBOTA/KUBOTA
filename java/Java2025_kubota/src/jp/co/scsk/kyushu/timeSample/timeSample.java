package jp.co.scsk.kyushu.timeSample;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class timeSample {
	private static final String DATE_PATTERN = "yyyy/MM/dd";
	private static final String DATE_PATTERN2 = "yy/M/d";
	private static final String DATE_PATTERN3 = "yyyy/MM/dd HH:mm:ss";

	public static void main(String[] args) throws ParseException {
//		newDateSample();
//		dateToStringSample();
//		newCalendarSample();
//		diffDateSample();
//		calendarToStringSample();
//		diffCalendarSample();
//		addCalendarSample();
//		newInstantSample();
//		instantToStringSample();
//		diffInstantSample();
		plusInstantSample();
	}

	private static void newDateSample() {
		Date date = new Date();
		System.out.println(date);
	}

	private static void dateToStringSample() {
		Date date = new Date();
		String dateSter = new SimpleDateFormat(DATE_PATTERN).format(date);
		System.out.println(dateSter);
		String dateSter2 = new SimpleDateFormat(DATE_PATTERN2).format(date);
		System.out.println(dateSter2);
	}

	private static void newCalendarSample() {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
	}

	private static void diffDateSample() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat(DATE_PATTERN);
		Date date1 = sdf.parse("2019/05/28");
		Date date2 = sdf.parse("2019/05/27");
		Date date3 = sdf.parse("2019/05/28");
		Date date4 = sdf.parse("2019/05/29");

		if (date1.after(date2)) {
			System.out.println(date1 + "は" + date2 + "よりも遅い");
		}
		if (date1.before(date4)) {
			System.out.println(date1 + "は" + date4 + "よりも早い");
		}
		if (date1.equals(date3)) {
			System.out.println(date1 + "は" + date3 + "と同じ");
		}
	}

	private static void calendarToStringSample() {
		Calendar cal = Calendar.getInstance();
		String dateSter = new SimpleDateFormat(DATE_PATTERN3).format(cal.getTime());
		System.out.println(dateSter);
	}

	private static void diffCalendarSample() throws ParseException {
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		cal2.add(Calendar.HOUR, -1);
		Calendar cal3 = Calendar.getInstance();
		cal3.add(Calendar.HOUR, 1);
		Calendar cal4 = (Calendar) cal1.clone();

		System.out.println(new SimpleDateFormat(DATE_PATTERN3).format(cal1.getTime()));
		System.out.println(new SimpleDateFormat(DATE_PATTERN3).format(cal2.getTime()));
		System.out.println(new SimpleDateFormat(DATE_PATTERN3).format(cal3.getTime()));
		System.out.println(new SimpleDateFormat(DATE_PATTERN3).format(cal4.getTime()));
		if (cal1.after(cal2)) {
			System.out.println("遅い");
		}
		if (cal1.before(cal3)) {
			System.out.println("早い");
		}
		if (cal1.equals(cal4)) {
			System.out.println("同じ");
		}
	}

	private static void addCalendarSample() {
		Calendar cal1 = Calendar.getInstance();
		System.out.println(new SimpleDateFormat(DATE_PATTERN3).format(cal1.getTime()));

		Calendar cal2 = Calendar.getInstance();
		cal2.add(Calendar.YEAR, 1);
		System.out.println(new SimpleDateFormat(DATE_PATTERN3).format(cal2.getTime()));

		Calendar cal3 = Calendar.getInstance();
		cal3.add(Calendar.MONTH, 1);
		System.out.println(new SimpleDateFormat(DATE_PATTERN3).format(cal3.getTime()));

		Calendar cal4 = Calendar.getInstance();
		cal4.add(Calendar.DAY_OF_MONTH, 1);
		System.out.println(new SimpleDateFormat(DATE_PATTERN3).format(cal4.getTime()));

		Calendar cal5 = Calendar.getInstance();
		cal5.add(Calendar.HOUR, 1);
		System.out.println(new SimpleDateFormat(DATE_PATTERN3).format(cal5.getTime()));

		Calendar cal6 = Calendar.getInstance();
		cal6.add(Calendar.MINUTE, 1);
		System.out.println(new SimpleDateFormat(DATE_PATTERN3).format(cal6.getTime()));

		Calendar cal7 = Calendar.getInstance();
		cal7.add(Calendar.SECOND, 1);
		System.out.println(new SimpleDateFormat(DATE_PATTERN3).format(cal7.getTime()));
	}

	private static void newInstantSample() {
		Instant instant = Instant.now();
		System.out.println(instant);
	}

	private static void instantToStringSample() {
		Instant instant = Instant.now();
		String dateStr = DateTimeFormatter.ofPattern(DATE_PATTERN3)
				.format(LocalDateTime.ofInstant(instant, ZoneId.systemDefault()));
		System.out.println(dateStr);
	}

	private static void diffInstantSample() {
		Instant instant1 = Instant.now();
		Instant instant2 = instant1.plus(-1, ChronoUnit.HOURS);
		Instant instant3 = instant1.plus(1, ChronoUnit.HOURS);
		Instant instant4 = instant1;
		System.out.println(DateTimeFormatter.ofPattern(DATE_PATTERN3)
				.format(LocalDateTime.ofInstant(instant1, ZoneId.systemDefault())));
		System.out.println(DateTimeFormatter.ofPattern(DATE_PATTERN3)
				.format(LocalDateTime.ofInstant(instant2, ZoneId.systemDefault())));
		System.out.println(DateTimeFormatter.ofPattern(DATE_PATTERN3)
				.format(LocalDateTime.ofInstant(instant3, ZoneId.systemDefault())));
		System.out.println(DateTimeFormatter.ofPattern(DATE_PATTERN3)
				.format(LocalDateTime.ofInstant(instant4, ZoneId.systemDefault())));

		if (instant1.isAfter(instant2)) {
			System.out.println("遅い");
		}
		if (instant1.isBefore(instant3)) {
			System.out.println("早い");
		}
		if (instant1.equals(instant4)) {
			System.out.println("同じ");
		}
	}

	private static void plusInstantSample() {
		Instant instant1 = Instant.now();
		System.out.println(DateTimeFormatter.ofPattern(DATE_PATTERN3)
				.format(LocalDateTime.ofInstant(instant1, ZoneId.systemDefault())));
//		Instant instant2 = instant1.plus(1, ChronoUnit.YEARS);
//		System.out.println(DateTimeFormatter.ofPattern(DATE_PATTERN3)
//				.format(LocalDateTime.ofInstant(instant2, ZoneId.systemDefault())));
//		Instant instant3 = instant1.plus(1, ChronoUnit.MONTHS);
//		System.out.println(DateTimeFormatter.ofPattern(DATE_PATTERN3)
//				.format(LocalDateTime.ofInstant(instant3, ZoneId.systemDefault())));
		Instant instant4 = instant1.plus(1, ChronoUnit.DAYS);
		System.out.println(DateTimeFormatter.ofPattern(DATE_PATTERN3)
				.format(LocalDateTime.ofInstant(instant4, ZoneId.systemDefault())));
		Instant instant5 = instant1.plus(1, ChronoUnit.HOURS);
		System.out.println(DateTimeFormatter.ofPattern(DATE_PATTERN3)
				.format(LocalDateTime.ofInstant(instant5, ZoneId.systemDefault())));
		Instant instant6 = instant1.plus(1, ChronoUnit.MINUTES);
		System.out.println(DateTimeFormatter.ofPattern(DATE_PATTERN3)
				.format(LocalDateTime.ofInstant(instant6, ZoneId.systemDefault())));
		Instant instant7 = instant1.plus(1, ChronoUnit.SECONDS);
		System.out.println(DateTimeFormatter.ofPattern(DATE_PATTERN3)
				.format(LocalDateTime.ofInstant(instant7, ZoneId.systemDefault())));
	}
}
