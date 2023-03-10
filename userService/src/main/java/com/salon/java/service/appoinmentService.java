package com.salon.java.service;

import java.util.List;


import com.salon.java.entities.appoinment;

public interface appoinmentService {
	
	
    List<appoinment> getAllappoinment();

    appoinment getAppoinment(String appoinId);

    appoinment saveAppoinment(appoinment appoinment);
	

}
