package com.github.misisisisi.dietfromatoz.service;

import com.github.misisisisi.dietfromatoz.model.ProductEntity;
import com.github.misisisisi.dietfromatoz.repository.PlanMealRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DefaultPlanMealService implements PlanMealService{

    private final PlanMealRepository planMealRepository;


    @Override
    public ProductEntity loadProductByName(String productName) {
        return planMealRepository.findByProductName(productName);
    }

}

