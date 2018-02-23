package com.todo.service;

import com.todo.model.*;
import java.util.*;

public class TodoService {

	private Map<Integer, Todo> map = new HashMap<>();
	static int ins;
	Todo todo = new Todo();

	public void addTodo(String title) {

		Todo todo = new Todo();
		todo.setId(++ins);
		todo.setTitle(title);
		map.put(todo.getId(), todo);

	}

	public void editTodo(int id, String newTitle) {

		Todo todo = map.get(id);
		todo.setTitle(newTitle);

	}

	public void deleteTodo(int id) {
		Todo todo = map.get(id);
		map.remove(id);
	}

	public void completeTodo(int id) {
		Todo todo = map.get(id);

		if (todo.isCompleted()) {
			todo.setCompleted(false);
		} else {
			todo.setCompleted(true);
		}
	}

	public void completeAll() {
		Collection<Todo> todo = map.values();
		for (Todo t : todo) {

			
				t.setCompleted(true);
			

		}
	}

	public void clearCompleted() {
		Collection<Todo> todo = map.values();
		for (Todo t : todo) {
			if (t.isCompleted()) {
				map.remove(t.getId());
			}
		}
	}

	public void viewAll() {
		Collection<Todo> todo = map.values();
		for (Todo t : todo) {
			if (t.isCompleted()) {
				System.out.println("Completed");
			} else {
				System.out.println("Not completed");
			}

			t.display();
		}

	}
}
