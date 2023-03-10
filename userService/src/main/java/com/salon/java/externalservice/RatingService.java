package com.salon.java.externalservice;


import com.salon.java.entities.Rating;
import com.salon.java.entities.Salon;

//import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@Service
//@FeignClient(name="RATING-SERVICE")
public interface RatingService {

    @PostMapping("/ratings/{ratingId}")
    Salon geSalon(@PathVariable("ratingId") String ratingId);

    @PostMapping("/ratings")
    public ResponseEntity<Rating> createRating(Rating values);


    //PUT
    @PutMapping("/ratings/{ratingId}")
    public ResponseEntity<Rating> updateRating(@PathVariable("ratingId") String ratingId, Rating rating);


    @DeleteMapping("/ratings/{ratingId}")
    public void deleteRating(@PathVariable String ratingId);
}
