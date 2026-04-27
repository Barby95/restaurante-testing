package com.restaurante.restaurantetesting.repository;

import com.restaurante.restaurantetesting.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<Review> findByRestaurant_IdOrderByCreationDateDesc(Long id);
    List<Review> findByDish_IdOrderByCreationDateDesc(Long id);

//SELECT * FROM reviews WHERE reviews.dish_id = 1 ORDER BY reviews.creation_date desc;
    //Si migras de bd pues tendras que cambiar estas funciones porque pueden escribirse de otra forma

}