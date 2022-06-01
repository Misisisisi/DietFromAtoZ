package com.github.misisisisi.dietfromatoz.repository;

import com.github.misisisisi.dietfromatoz.model.ProductOfMealEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AddProductToMealRepository extends JpaRepository<ProductOfMealEntity, Long> {

    List<ProductOfMealEntity> findALLByDayNameAndMealName (String dayName, String mealName);
}
