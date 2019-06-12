package com.flairs.exceptions;

public class CountryNotFound extends Exception{
	
	public CountryNotFound(){
		super("country not found, please enter a valid code");
	}
	
}
