package com.me.learn.json;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.databind.util.StdConverter;

public class StringToDateConverter extends StdConverter<String, Date> {

	@Override
	public Date convert(String value) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
		Date d = null;
		try {
			d = sdf.parse(value);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return d;
	}
}
