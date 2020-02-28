package com.me.pojo;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.me.learn.json.Person;

public class PersonSerializeTest {

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testSerialize() throws JsonProcessingException {
		Person p = new Person();
		p.setId(12345L);
		p.setName("abc xyz");
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 1990);
		cal.set(Calendar.MONTH, 1);
		cal.set(Calendar.DATE, 10);
		p.setDob(cal.getTime());
		String result = new ObjectMapper().writeValueAsString(p);
		System.out.println("result: "+result);
		assertThat(result, containsString("12345"));
		assertThat(result, containsString("abc xyz"));
		//fail("Not yet implemented");
		System.out.println("testSerialize complete.");
	}

}
