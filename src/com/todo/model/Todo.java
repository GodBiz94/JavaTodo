package com.todo.model;

public class Todo {

	private int id;
	private String title;
	private boolean completed = false;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	public void display() {
		System.out.println("id :" + id + " " + "Title :" + title);
	}
}
