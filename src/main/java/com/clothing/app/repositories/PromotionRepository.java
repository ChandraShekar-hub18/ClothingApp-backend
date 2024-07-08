package com.clothing.app.repositories;

import com.clothing.app.entities.Promotion;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PromotionRepository extends JpaRepository<Promotion, Integer> {
}
