package com.luciano.todo.services;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luciano.todo.domain.Todo;
import com.luciano.todo.repositories.TodoRepository;

@Service
public class DBService {

	@Autowired
	private TodoRepository todoRepository;

	public void instanciaBaseDeDados() {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		Todo t1 = new Todo(null, "Estudar", "Estudar Spring Boot 2 e Angular 11",
				LocalDateTime.parse("20/03/2022 00:00", formatter), false);
		Todo t2 = new Todo(null, "Ler", "Livro sobre JAVA",
				LocalDateTime.parse("15/01/2022 00:00", formatter), true);
		Todo t3 = new Todo(null, "Desenvolver", "Projeto Java com Spring boot",
				LocalDateTime.parse("10/02/2022 00:00", formatter), true);
		Todo t4 = new Todo(null, "Exercicios", "Correr e fazer caminhada",
				LocalDateTime.parse("20/03/2022 00:00", formatter), false);

		todoRepository.saveAll(Arrays.asList(t1, t2, t3, t4));

	}

}
