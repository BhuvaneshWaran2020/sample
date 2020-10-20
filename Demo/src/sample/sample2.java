package sample;

import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class sample2 {

	public static void main(String[] args) throws ParseException {

		/*Locale locale = new Locale("en", "UK");
		DateFormatSymbols dateFormatSymbols = new DateFormatSymbols(locale);
		dateFormatSymbols.setWeekdays(new String[]{
		        "Unused",
		        "Sad Sunday",
		        "Manic Monday",
		        "Thriving Tuesday",
		        "Wet Wednesday",
		        "Total Thursday",
		        "Fat Friday",
		        "Super Saturday",
		});

		String pattern = "EEEEE MMMMM yyyy";
		SimpleDateFormat simpleDateFormat =
		        new SimpleDateFormat(pattern, dateFormatSymbols);

		String date = simpleDateFormat.format(new Date());
		System.out.println(date);
		*/
		Date now = new Date();

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ");

		simpleDateFormat.setTimeZone(TimeZone.getTimeZone("Europe/London"));
		System.out.println(simpleDateFormat.format(now));

		simpleDateFormat.setTimeZone(TimeZone.getTimeZone("Europe/Paris"));
		String date=simpleDateFormat.format(now);
		
		System.out.println(date);
		
	}

}
