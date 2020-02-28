package com.me.learn.json;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.databind.util.StdConverter;

public class DateToStringConverter extends StdConverter<Date, String> {

	@Override
	public String convert(Date value) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
		return sdf.format(value);
	}
}
