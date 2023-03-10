package com.salon.java.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.salon.java.entities.User;
import com.salon.java.entities.appoinment;
import com.salon.java.service.appoinmentService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/appoinment")
public class appoinmentController {

	@Autowired
	private appoinmentService appoinmentService;

	private Logger logger = LoggerFactory.getLogger(appoinmentController.class);

	
	@PostMapping
	public ResponseEntity<appoinment> createUser(@RequestBody appoinment appoinment) {

		appoinment appoinment1 = appoinmentService.saveAppoinment(appoinment);
		return ResponseEntity.status(HttpStatus.CREATED).body(appoinment1);
	}

	@GetMapping("/{appoinId}")
	public ResponseEntity<appoinment> getSingleUser(@PathVariable String appoinId) {
		appoinment appoinment = appoinmentService.getAppoinment(appoinId);
		return ResponseEntity.ok(appoinment);
	}

	
	@GetMapping
	public ResponseEntity<List<appoinment>> getAllUser() {
		List<appoinment> allappoinment = appoinmentService.getAllappoinment();
		return ResponseEntity.ok(allappoinment);
	}

}
