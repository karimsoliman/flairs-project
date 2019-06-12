package com.flairs.models;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;



public class CountryTest {
	
	private static final double DELTA = 1e-15;
	
	Country country1;
	Country country2;
	
	@Before
	public void setup() {
		country1 = new Country("AFG","Afghanistan", "Asia", 1500, 144.5);
		country2 = new Country("Egypt", "Africa", 2500, 15.3);
	}
	
	@Test
	public void testConstructor1() {
		assertEquals("AFG", country1.getCode());
		assertEquals("Afghanistan", country1.getName());
		assertEquals("Asia", country1.getContinent());
		assertEquals(1500, country1.getPopulation());
		assertEquals(144.5, country1.getLifeExpectancy(), DELTA);
	}
	
	@Test
	public void testConstructor2() {
		assertEquals("Egypt", country2.getName());
		assertEquals("Africa", country2.getContinent());
		assertEquals(2500, country2.getPopulation());
		assertEquals(15.3, country2.getLifeExpectancy(), DELTA);
	}
	
	
	@Test
	public void testName() {
		country1.setName("Japan");
		assertEquals("Japan", country1.getName());
	}
	
	@Test
	public void testCode() {
		country1.setCode("Ja");
		assertEquals("Ja", country1.getCode());
	}
	
	@Test
	public void testContinent() {
		country1.setContinent("Europe");
		assertEquals("Europe", country1.getContinent());
	}
	
	@Test
	public void testPopulation() {
		country1.setPopulation(2400);
		assertEquals(2400, country1.getPopulation());
	}
	
	@Test
	public void testLifeExpectancy() {
		country1.setLifeExpectancy(12.5);
		assertEquals(12.5, country1.getLifeExpectancy(), DELTA);
	}
	
	
	@Test
	public void testLanguages(){
		
		ArrayList<String> languages = new ArrayList<>();
		languages.add("Arabic");
		
		country2.setLanguages(languages);
		assertEquals("Arabic", country2.getLanguages().get(0));
 		
	}
	
}
