package com.me.learn.json;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

public class PersonDeserializeTest {

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testDeserialize() throws IOException {
		String jsonStr = "{\"id\":12345,\"name\":\"abc xyz\",\"dob\":\"10-Feb-1990\"}";
		Person p = new ObjectMapper().readValue(jsonStr, Person.class);
		System.out.println(p.toString());
		assertNotNull(p);
		assertThat(p, equalTo(new Person(12345L)));
		System.out.println("testDeserialize complete.");
	}

}
