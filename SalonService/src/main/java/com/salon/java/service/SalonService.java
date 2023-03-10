package com.salon.java.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.salon.java.entity.Salon;

@Service
public interface SalonService {
    Salon create(Salon salon);

   
    List<Salon> getAllSalon();
  

    Salon getSalon(String Id);
    
    void delete(String Id);
    
    }
