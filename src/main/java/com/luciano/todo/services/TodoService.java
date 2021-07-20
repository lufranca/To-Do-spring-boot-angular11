package com.luciano.todo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luciano.todo.domain.Todo;
import com.luciano.todo.repositories.TodoRepository;
import com.luciano.todo.services.exceptions.ObjectNotFoundException;

@Service
public class TodoService {

	@Autowired
	private TodoRepository repository;

	public Todo findById(Integer id) {
		Optional<Todo> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + " Tipo: " + Todo.class.getName()));
	}

	public List<Todo> findAll() {
		List<Todo> list = repository.findAll();
		return list;
	}

	public Todo create(Todo obj) {
		obj.setId(null);
		return repository.save(obj);
	}

	public void delete(Integer id) {
		repository.deleteById(id);
	}

}
