package com.luciano.todo.services;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.luciano.todo.domain.Todo;
import com.luciano.todo.repositories.TodoRepository;

@Service
public class DBService {
	
	@Autowired
	private TodoRepository todoRepository;
	
	@Bean
	public void instanciaBaseDeDados() {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		Todo t1 = new Todo(null, "Estudar", "Estudar Spring Boot 2 e Angular 11", 
				LocalDateTime.parse("20/03/2022 00:00", formatter), false);
		
		todoRepository.saveAll(Arrays.asList(t1));
		
	}

}
