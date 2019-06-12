package com.flairs.models;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Country {
	private String code;
	private String name;
	private String continent;
	private int population;
	private double lifeExpectancy;
	private ArrayList<String> languages;
	
	public Country(@JsonProperty("code") String code, @JsonProperty("name") String name,
			@JsonProperty("continent") String continent, @JsonProperty("population") int population,
			@JsonProperty("lifeExpectancy") double lifeExpectancy) {
		this.code= code;
		this.name= name;
		this.continent = continent;
		this.population = population;
		this.lifeExpectancy = lifeExpectancy;
	}
	
	public Country(@JsonProperty("name") String name,
			@JsonProperty("continent") String continent, @JsonProperty("population") int population,
			@JsonProperty("lifeExpectancy") double lifeExpectancy) {
		this.name= name;
		this.continent = continent;
		this.population = population;
		this.lifeExpectancy = lifeExpectancy;
	}
	
	public void setCode(String code) {
		this.code = code;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public void setLifeExpectancy(double lifeExpectancy) {
		this.lifeExpectancy = lifeExpectancy;
	}

	public void setLanguages(ArrayList<String> languages) {
		this.languages = languages;
	}

	public String getCode() {
		return this.code;
	}

	public String getName() {
		return this.name;
	}

	public String getContinent() {
		return this.continent;
	}

	public int getPopulation() {
		return this.population;
	}

	public double getLifeExpectancy() {
		return this.lifeExpectancy;
	}

	public ArrayList<String> getLanguages() {
		return this.languages;
	}
	
}
