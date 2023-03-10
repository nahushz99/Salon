package com.salon.java.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.salon.java.entity.Salon;
import com.salon.java.service.SalonService;

@RestController
@RequestMapping("/salons")
@CrossOrigin(origins = "http://localhost:3000")
public class SalonController {

    @Autowired
    private SalonService salonService;

    
   @PreAuthorize(" hasAuthority('Admin')")
    @PostMapping
    public ResponseEntity<Salon> createSalon(@RequestBody Salon salon){
        return ResponseEntity.status(HttpStatus.CREATED).body(salonService.create(salon));
    }

   // @PreAuthorize("hasAuthority('SCOPE_internal')")
    @GetMapping("/{Id}")
    public ResponseEntity<Salon> createSalon(@PathVariable String Id){
        return ResponseEntity.status(HttpStatus.OK).body(salonService.getSalon(Id));
    }

   
  //  @PreAuthorize("hasAuthority('SCOPE_internal') || hasAuthority('Admin')")
    @GetMapping
    public ResponseEntity<List<Salon>> getAll(){
        return ResponseEntity.ok(salonService.getAllSalon());
    }
    
    @DeleteMapping("/{Id}")
    public ResponseEntity<Salon> delete(@PathVariable("Id") String Id) {
    	salonService.delete(Id);
        return ResponseEntity.noContent().build();
    }
}
