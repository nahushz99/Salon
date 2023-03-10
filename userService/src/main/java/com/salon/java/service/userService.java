package com.salon.java.service;

import java.util.List;

import com.salon.java.entities.User;

public interface userService {
	
	//create
   
    // get all list
    List<User> getAllUser();
    // get single user of given userId

    User getUser(String useId);

	User saveUser(User user);
	
	void delete(String userId);
	
    

}
