package com.clothing.app.repositories;

import com.clothing.app.entities.Shoppingcart;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ShoppingcartRepository extends JpaRepository<Shoppingcart, Integer> {
}
