package com.luciano.todo.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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

	public void instanciaBaseDeDados() throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Todo t1 = new Todo(null, "Estudar", "Estudar Spring Boot 2 e Angular 11",
				sdf.parse("20/03/2022"), false);
		Todo t2 = new Todo(null, "Ler", "Livro sobre JAVA",
				sdf.parse("15/01/2022"), true);
		Todo t3 = new Todo(null, "Desenvolver", "Projeto Java com Spring boot",
				sdf.parse("10/02/2022"), true);
		Todo t4 = new Todo(null, "Exercicios", "Correr e fazer caminhada",
				sdf.parse("20/03/2022"), false);

		todoRepository.saveAll(Arrays.asList(t1, t2, t3, t4));
	}

}
