package com.github.misisisisi.dietfromatoz.service;

import com.github.misisisisi.dietfromatoz.model.ProductEntity;
import com.github.misisisisi.dietfromatoz.repository.PlanMealRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DefaultPlanMealService implements PlanMealService{

    private final PlanMealRepository planMealRepository;

    @Override
    public List<ProductEntity> findByName(String name) {
        return null;
    }
}
