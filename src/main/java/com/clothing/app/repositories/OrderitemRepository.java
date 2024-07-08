package com.clothing.app.repositories;

import com.clothing.app.entities.Orderitem;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderitemRepository extends JpaRepository<Orderitem, Integer> {
}
