package com.ribeirocompany.cardapio.repository;

import com.ribeirocompany.cardapio.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food,Integer> {

}
