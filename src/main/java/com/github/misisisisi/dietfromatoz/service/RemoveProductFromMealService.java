package com.github.misisisisi.dietfromatoz.service;

import com.github.misisisisi.dietfromatoz.model.ProductOfMealEntity;
import com.github.misisisisi.dietfromatoz.repository.RemoveProductFromMealRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class RemoveProductFromMealService {

    private final RemoveProductFromMealRepository removeProductFromMealRepository;

    @Transactional
    public void removeProduct(ProductOfMealEntity productOfMeal) {
        removeProductFromMealRepository.delete(productOfMeal);

    }
}
