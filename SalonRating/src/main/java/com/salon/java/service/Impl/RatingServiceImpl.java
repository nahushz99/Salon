package com.salon.java.service.Impl;

import com.salon.java.entities.Rating;
import com.salon.java.repository.RatingRepository;
import com.salon.java.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    private RatingRepository repository;

    // save rating function
    @Override
    public Rating create(Rating rating) {
        String ratingId = UUID.randomUUID().toString();
        rating.setRatingId(ratingId);
        return repository.save(rating);
    }

    // getting all rating
    @Override
    public List<Rating> getRatings() {
        return repository.findAll();
    }

    // searching by user ID
    @Override
    public List<Rating> getRatingByUserId(String userId) {
        return repository.findByUserId(userId);
    }

    //searching by salon ID
    @Override
    public List<Rating> getRatingBySalonId(String salonId) {
        return repository.findBySalonId(salonId);
    }

	@Override
	public void delete(String ratingId) {
		repository.deleteById(ratingId);
		
	}
}
