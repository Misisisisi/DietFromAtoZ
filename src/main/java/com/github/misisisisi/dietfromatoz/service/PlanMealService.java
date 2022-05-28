package com.github.misisisisi.dietfromatoz.service;

import com.github.misisisisi.dietfromatoz.model.ProductEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PlanMealService {

    List<ProductEntity> findByName (String name);
}
