package com.myapp.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.myapp.models.User;

public class UserControllerImpl {
	
	private static Map<Integer, User> users = new HashMap<Integer, User>();
	private static int idIndex = 3;
	
	static {
		User joel = new User(1,"Joel", 12, "joel@example.com");
		User pepito =  new User(2,"Pepito", 15, "pepito@any.com");
		User lorem = new User(3,"Lorem", 24, "lorem@impsum.com");
	}
	
	public static List<User> list(){
		return new ArrayList<User>(users.values());
	}
	
	public static User create(User user) {
		idIndex += 1;
		user.setId(idIndex);
		users.put(idIndex, user);
		return user;
	}
	
	public static User get(Integer id) {
		return users.get(id);
	}
	
	public static User update(Integer id, User user) {
		users.put(id, user);
		return user;
	}
	
	public static User delete(Integer id) {
		return users.remove(id);
	}

}
