package com.flairs.controllers;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.flairs.interfaces.countryDaoInterface;
import com.flairs.models.Country;


@RestController
public class countryController {
	
	@Autowired
	private countryDaoInterface countryDao;
	
	@RequestMapping("/test")
	public Date test() {
		return new Date();
	}
	
	@RequestMapping(value = "/user/{code}", method = RequestMethod.GET)
	public Country getCountry(@PathVariable("code") String code) {
		return countryDao.getCountry(code);
	}
	
}
