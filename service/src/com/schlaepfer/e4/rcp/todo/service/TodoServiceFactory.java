package com.schlaepfer.e4.rcp.todo.service;

import com.schlaepfer.e4.rcp.todo.model.ITodoService;
import com.schlaepfer.e4.rcp.todo.service.internal.MyTodoServiceImpl;

public class TodoServiceFactory {

	private static ITodoService todoService = new MyTodoServiceImpl();

	public static ITodoService getInstance() {
		return todoService;
	}

}
