package com.github.misisisisi.dietfromatoz.repository;

import com.github.misisisisi.dietfromatoz.model.ProductOfMealEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AddProductToMealRepository extends JpaRepository<ProductOfMealEntity, Long> {

    @Query("SELECT productOfMealEntity FROM ProductOfMealEntity productOfMealEntity WHERE productOfMealEntity.dayName.dayName=:dayName AND productOfMealEntity.mealName.mealName=:mealName")
    List<ProductOfMealEntity> findAllByDayNameAndMealName(@Param("dayName")String dayName, @Param("mealName") String mealName);

}
