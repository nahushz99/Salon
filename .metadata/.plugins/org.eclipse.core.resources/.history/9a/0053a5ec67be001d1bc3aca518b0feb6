package com.salon.java.controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.salon.java.entities.User;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/users")
public class userController {

	@Autowired
	private com.salon.java.service.userService userService;

	private Logger logger = LoggerFactory.getLogger(userController.class);
	
	
	// create
	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody User user) {

		User user1 = userService.saveUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(user1);
	}

	@GetMapping("/{userId}")
//    @CircuitBreaker(name="ratingSalonBreaker", fallbackMethod = "ratingSalonFallback")
	public ResponseEntity<User> getSingleUser(@PathVariable String userId) {
		User user = userService.getUser(userId);
		return ResponseEntity.ok(user);
	}

	// if you use "/ " with get mapping user you will get this method
	@GetMapping
	public ResponseEntity<List<User>> getAllUser() {
		List<User> allUser = userService.getAllUser();
		return ResponseEntity.ok(allUser);
	}
	 @DeleteMapping("/{userId}")
	    public ResponseEntity<User> delete(@PathVariable("userId") String userId) {
		 userService.delete(userId);
	        return ResponseEntity.noContent().build();
	    }

}
