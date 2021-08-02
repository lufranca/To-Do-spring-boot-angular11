package com.luciano.todo.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.luciano.todo.services.DBService;

import java.text.ParseException;

@Configuration
@Profile("test")
public class TestConfig {
	
	@Autowired
	private DBService dbService;
	
	@Bean
	public boolean instancia() throws ParseException {
		this.dbService.instanciaBaseDeDados();
		return true;
	}

}
