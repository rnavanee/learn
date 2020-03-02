package com.me.learn.json.util;

import com.fasterxml.jackson.databind.util.StdConverter;

public class JsonPersonNameConverter extends StdConverter<String, String>{

	@Override
	public String convert(String value) {
		return "Mr. "+value;
	}
}
