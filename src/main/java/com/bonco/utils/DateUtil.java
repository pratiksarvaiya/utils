package com.bonco.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	
	 private static SimpleDateFormat dateFormatLocal = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

	    public static String getStringFromDate(Date date) {
	        return dateFormatLocal.format(date);
	    }

	    public static Date getDateFromString(String dateString) {
	        try {
	            return dateFormatLocal.parse(dateString);
	        } catch (ParseException e) {
	            e.printStackTrace();
	        }
	        return null;
	    }
}
