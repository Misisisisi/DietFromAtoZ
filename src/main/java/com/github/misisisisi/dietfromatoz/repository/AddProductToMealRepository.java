package com.github.misisisisi.dietfromatoz.repository;

import com.github.misisisisi.dietfromatoz.model.ProductOfMealEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AddProductToMealRepository extends JpaRepository<ProductOfMealEntity, Long> {
//
//    @Query("SELECT productOfMeal FROM ProductOfMealEntity  productOfMeal WHERE  productOfMeal.dayName.dayName = :dayName AND productOfMeal.mealName.mealName = :mealName")
//    List<ProductOfMealEntity> findAllByDayNameAndMealName(@Param("dayName")String dayName, @Param("mealName")String mealName);


    @Query("SELECT productOfMeal FROM ProductOfMealEntity productOfMeal WHERE productOfMeal.mealName.mealName = 'Śniadanie' AND productOfMeal.dayName.dayName = :dayName")
    List<ProductOfMealEntity> findAllBreakfastFromDay(@Param("dayName")String dayName);

    @Query("SELECT productOfMeal FROM ProductOfMealEntity productOfMeal WHERE productOfMeal.mealName.mealName = 'II śniadanie' AND productOfMeal.dayName.dayName = :dayName")
    List<ProductOfMealEntity> findAllSecondBreakfastFromDay(@Param("dayName")String dayName);

    @Query("SELECT productOfMeal FROM ProductOfMealEntity productOfMeal WHERE productOfMeal.mealName.mealName = 'Obiad' AND productOfMeal.dayName.dayName = :dayName")
    List<ProductOfMealEntity> findAlLunchFromDay(@Param("dayName")String dayName);

    @Query("SELECT productOfMeal FROM ProductOfMealEntity productOfMeal WHERE productOfMeal.mealName.mealName = 'Podwieczorek' AND productOfMeal.dayName.dayName = :dayName")
    List<ProductOfMealEntity> findAlTeaFromDay(@Param("dayName")String dayName);

    @Query("SELECT productOfMeal FROM ProductOfMealEntity productOfMeal WHERE productOfMeal.mealName.mealName = 'Kolacja' AND productOfMeal.dayName.dayName = :dayName")
    List<ProductOfMealEntity> findAlDinnerFromDay(@Param("dayName")String dayName);

}
