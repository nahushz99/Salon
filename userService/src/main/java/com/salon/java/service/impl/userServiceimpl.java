package com.salon.java.service.impl;

import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.salon.java.entities.User;
import com.salon.java.exception.ResourceNotFoundException;
import com.salon.java.repository.userRepository;
import com.salon.java.service.userService;





@Service
public class userServiceimpl implements userService{
	
	@Autowired
    private userRepository userRepositories;
  
//    @Autowired
//    private SalonService salonService;

    private Logger logger = LoggerFactory.getLogger(userServiceimpl.class);


    @Override
    public User saveUser(User user) {
        String randomUserId = UUID.randomUUID().toString();  // generate unique user id
        user.setUserId(randomUserId);
        return userRepositories.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepositories.findAll();
    }

    @Override
    public User getUser(String userId) {
        User user = userRepositories.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User with given id is not found on server !! : " + userId));
        return user;

}
    @Override
    public void delete(String id) {
    	userRepositories.deleteById(id);
    }
    
    
}
