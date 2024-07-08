package com.clothing.app.repositories;

import com.clothing.app.entities.Review;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ReviewRepository extends JpaRepository<Review, Integer> {
}
