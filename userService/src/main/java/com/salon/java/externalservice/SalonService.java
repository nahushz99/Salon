package com.salon.java.externalservice;


import  com.salon.java.entities.Salon;
//import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service 
//@FeignClient(name = "HOTEL-SERVICE")
public interface SalonService {

    @GetMapping("/salons/{salonId}")
    Salon geSalon(@PathVariable("salonId") String SalonId);
}
