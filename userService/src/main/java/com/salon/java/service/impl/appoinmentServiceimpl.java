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
import com.salon.java.service.appoinmentService;
import com.salon.java.service.userService;
import com.salon.java.repository.appoiRepository;
import com.salon.java.entities.appoinment;





@Service
public class appoinmentServiceimpl implements appoinmentService{
	

     
	@Autowired
    private appoiRepository appoiRepository;


    private Logger logger = LoggerFactory.getLogger(appoinmentServiceimpl.class);


  

	@Override
	public List<appoinment> getAllappoinment() {
		
		return appoiRepository.findAll();
	}

	@Override
	public appoinment getAppoinment(String appoinId) {
		appoinment appoinment = appoiRepository.findById(appoinId).orElseThrow(() -> new ResourceNotFoundException("User with given id is not found on server !! : " + appoinId));
	        return appoinment;
	}

	@Override
	public appoinment saveAppoinment(appoinment appoinment) {
		 String randomUserId = UUID.randomUUID().toString();  
	        appoinment.setAppoinId(randomUserId);
	        return appoiRepository.save(appoinment);
	}


	
	}

