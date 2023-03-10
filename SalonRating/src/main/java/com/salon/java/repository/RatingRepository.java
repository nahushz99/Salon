package com.salon.java.repository;

import com.salon.java.entities.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RatingRepository extends JpaRepository<Rating, String> {

    //custom finder methods by using userId and salonId
    List<Rating> findByUserId(String userId);
    List<Rating> findBySalonId(String hotelId);


}
