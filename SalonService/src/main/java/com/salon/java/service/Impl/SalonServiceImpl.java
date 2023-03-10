package com.salon.java.service.Impl;

import com.salon.java.entity.Salon;
import com.salon.java.exception.ResourceNotFoundException;
import com.salon.java.repository.SalonRepository;
import com.salon.java.service.SalonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class SalonServiceImpl implements SalonService {

    @Autowired
    private SalonRepository salonRepository;


    @Override
    public Salon create(Salon salon) {
        String salonId = UUID.randomUUID().toString();
        salon.setId(salonId);
        return salonRepository.save(salon);
    }

    @Override
    public List<Salon> getAllSalon() {
        return salonRepository.findAll();
    }

    @Override
    public Salon getSalon(String Id) {
        return salonRepository.findById(Id).orElseThrow(()->new ResourceNotFoundException("Salon given Id not found"));
    }

	@Override
	public void delete(String Id) {
		salonRepository.deleteById(Id);
		
	}
}
