package com.github.misisisisi.dietfromatoz.repository;

import com.github.misisisisi.dietfromatoz.model.ProductOfMealEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddProductToMealRepository extends JpaRepository<ProductOfMealEntity, Long> {
}
