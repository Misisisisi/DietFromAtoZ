package com.github.misisisisi.dietfromatoz.service;

import com.github.misisisisi.dietfromatoz.model.ProductEntity;
import com.github.misisisisi.dietfromatoz.model.ProductOfMeal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PlanMealService {

    public ProductEntity loadProductByName (String productName);

}
