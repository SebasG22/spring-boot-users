package com.myapp.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.models.User;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
	
	@RequestMapping(method = RequestMethod.GET)
	public List<User> list(){
		return UserControllerImpl.list();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public User create(@RequestBody User user) {
		return UserControllerImpl.create(user);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public User update(@PathVariable Integer id, @RequestBody User user) {
		return UserControllerImpl.update(id, user);
	}
	
	@RequestMapping(method = RequestMethod.DELETE)
	public User delete(@PathVariable Integer id) {
		return UserControllerImpl.delete(id);
	}
	
}
