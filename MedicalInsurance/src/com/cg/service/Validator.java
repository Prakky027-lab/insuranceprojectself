package com.cg.service;

public interface Validator {
	String idpattern="[1-9][0-9]{2}";
	String namepattern="[A-Za-z][A-Za-z\\s]+";
	String salpattern="[1-9][0-9]{3}[0-9]*(\\.[0-9]{2})?";
	String despattern="[A-Z][a-zA-Z ]*";
	public static boolean validate(String data,String pattern)
	{
		return data.matches(pattern);
	}

}