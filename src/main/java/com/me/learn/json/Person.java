package com.me.learn.json;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.me.learn.json.util.JsonDateToStringConverter;
import com.me.learn.json.util.JsonPersonNameConverter;
import com.me.learn.json.util.JsonStringToDateConverter;


@JsonIgnoreProperties (ignoreUnknown = true, value = { "isSenior" })
public class Person {

	private Long id;
	
	@JsonSerialize (converter=JsonPersonNameConverter.class)
	private String name;

	private Boolean isSenior;
	
	@JsonSerialize (converter = JsonDateToStringConverter.class)
	@JsonDeserialize (converter = JsonStringToDateConverter.class)
	private Date dob;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person(Long id) {
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Boolean getIsSenior() {
		return isSenior;
	}
	public void setIsSenior(Boolean isSenior) {
		this.isSenior = isSenior;
	}
	
	@Override
	public boolean equals(Object obj) {
		Person p2 = (Person)obj;
		boolean result = (p2!=null)?this.id.equals(p2.getId()):false;
		return result;
	}
	
	@Override
	public String toString() {
		String s = null;
		try {
			s = new ObjectMapper().writeValueAsString(this);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			s = super.toString();
		}
		return s;
	}
	
}
