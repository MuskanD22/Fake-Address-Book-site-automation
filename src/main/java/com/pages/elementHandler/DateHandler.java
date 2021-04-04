package com.pages.elementHandler;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * This class is used to handle the date
 */

public class DateHandler {

	// This method is used to convert the date format and will return the date as string

	public static String convertToDate(String receivedDate) {
		String date_s = receivedDate;
		SimpleDateFormat dt = new SimpleDateFormat("dd/mm/yyyy");
		Date date = null;
		try {
			date = dt.parse(date_s);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		SimpleDateFormat dt1 = new SimpleDateFormat("mm/dd/yyyy");

		return dt1.format(date);
	}
}
