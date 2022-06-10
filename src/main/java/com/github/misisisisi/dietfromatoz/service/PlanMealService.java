package com.github.misisisisi.dietfromatoz.service;

import com.github.misisisisi.dietfromatoz.model.ProductEntity;


public interface PlanMealService {

    ProductEntity loadProductByName (String productName);

    ProductEntity loadProductByNameAndUserName(String productName, String username);
}

