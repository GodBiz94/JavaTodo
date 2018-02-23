package com.todo;

import com.todo.model.*;
import com.todo.service.*;
import java.util.*;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Todo todo = new Todo();
		TodoService service = new TodoService();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of tasks: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Title : ");
			String title = sc.next();
			
			service.addTodo(title);
			
		}
		
	
		
		
		service.completeAll();
		
		
		service.viewAll();
	
		

	}

}
