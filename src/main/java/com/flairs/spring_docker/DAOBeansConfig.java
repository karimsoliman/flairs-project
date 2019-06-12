package com.flairs.spring_docker;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.flairs.interfaces.countryDaoInterface;
import com.flairs.daos.countryDaoImp;

@Configuration
@ComponentScan("com.flairs.daos")
public class DAOBeansConfig {

	@Bean
	@Primary
	public countryDaoInterface getUserDao() {
		return new countryDaoImp();
	}
	
}
