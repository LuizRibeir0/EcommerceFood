package com.ribeirocompany.cardapio.controllers;

import com.ribeirocompany.cardapio.entity.Food;
import com.ribeirocompany.cardapio.entity.FoodRequestDTO;
import com.ribeirocompany.cardapio.entity.FoodResponseDTO;
import com.ribeirocompany.cardapio.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("food")
public class FoodController {

    @Autowired
    private FoodRepository foodRepository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<FoodResponseDTO> getAll(){
        List<FoodResponseDTO> foodList = foodRepository.findAll()
                .stream()
                .map(FoodResponseDTO::new)
                .toList();
        return foodList;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void SaveFood(@RequestBody FoodRequestDTO data){
        Food foodData = new Food(data);
        foodRepository.save(foodData);

    }
}
