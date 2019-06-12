package com.flairs.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.apache.commons.dbutils.DbUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.flairs.interfaces.countryDaoInterface;
import com.flairs.models.Country;

public class countryDaoImp implements countryDaoInterface {

	@Autowired
	private DataSource dataSource;
	
	@Override
	public Country getCountry(String code){
		Country c = getCountryDetails(code);
		ArrayList<String> languages = getCountryLanguages(code);
		
		Country result = new Country(code, c.getName(), c.getContinent(), c.getPopulation(), c.getLifeExpectancy());
		result.setLanguages(languages);
		
		return result;
		
	}
	
	
	
	private Country getCountryDetails(String code) {
		Country result = null;
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet queryResult = null;
		
		try {
			conn = dataSource.getConnection();
			psmt = conn.prepareStatement("SELECT * FEOM country WHERE code=? ");
			psmt.setString(1, code);
			queryResult = psmt.executeQuery();
			
			while(queryResult.next()){
				String cName = queryResult.getString("name");
				String cContinent = queryResult.getString("continent");
				int cPopulation = queryResult.getInt("population");
				double cLifeExpectancy = queryResult.getDouble("lifeexpectancy");
				result = new Country(cName, cContinent, cPopulation, cLifeExpectancy);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DbUtils.closeQuietly(psmt);
			DbUtils.closeQuietly(conn);
		}
		
		return result;
	}
	
	private ArrayList<String> getCountryLanguages(String code){
		ArrayList<String> result = new ArrayList<>();
		
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet queryResult = null;
		
		try {
			conn = dataSource.getConnection();
			psmt = conn.prepareStatement("SELECT language FEOM country join countrylanguage on country.code = countrylanguage.countrycode where country.code = ? ");
			psmt.setString(1, code);
			queryResult = psmt.executeQuery();
			
			while(queryResult.next()){
				String language = queryResult.getString("language");
				result.add(language);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DbUtils.closeQuietly(psmt);
			DbUtils.closeQuietly(conn);
		}
		
		return result;
		
	}
	
	

}
