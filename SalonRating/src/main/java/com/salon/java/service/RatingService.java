package com.salon.java.service;

import com.salon.java.entities.Rating;

import java.util.List;

public interface RatingService {

    //create
    Rating create(Rating rating);


    //get all ratings
    List<Rating> getRatings();

    //get all by UserId
    List<Rating> getRatingByUserId(String userId);

    //get all by Salon
    List<Rating> getRatingBySalonId(String salonId);
    
    void delete(String ratingId);

}
