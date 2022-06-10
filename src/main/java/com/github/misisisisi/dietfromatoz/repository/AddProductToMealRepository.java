package com.github.misisisisi.dietfromatoz.repository;

import com.github.misisisisi.dietfromatoz.model.ProductOfMealEntity;
import com.github.misisisisi.dietfromatoz.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AddProductToMealRepository extends JpaRepository<ProductOfMealEntity, Long> {

    @Query("SELECT productOfMeal FROM ProductOfMealEntity productOfMeal WHERE productOfMeal.mealName.mealName = 'Śniadanie' AND productOfMeal.dayName.dayName = :dayName AND productOfMeal.owner.username=:username")
    List<ProductOfMealEntity> findAllBreakfastFromDay(@Param("dayName")String dayName, String username);

    @Query("SELECT productOfMeal FROM ProductOfMealEntity productOfMeal WHERE productOfMeal.mealName.mealName = 'II śniadanie' AND productOfMeal.dayName.dayName = :dayName AND productOfMeal.owner.username=:username")
    List<ProductOfMealEntity> findAllSecondBreakfastFromDay(@Param("dayName")String dayName, String username);

    @Query("SELECT productOfMeal FROM ProductOfMealEntity productOfMeal WHERE productOfMeal.mealName.mealName = 'Obiad' AND productOfMeal.dayName.dayName = :dayName AND productOfMeal.owner.username=:username")
    List<ProductOfMealEntity> findAlLunchFromDay(@Param("dayName")String dayName, String username);

    @Query("SELECT productOfMeal FROM ProductOfMealEntity productOfMeal WHERE productOfMeal.mealName.mealName = 'Podwieczorek' AND productOfMeal.dayName.dayName = :dayName AND productOfMeal.owner.username=:username")
    List<ProductOfMealEntity> findAlTeaFromDay(@Param("dayName")String dayName, String username);

    @Query("SELECT productOfMeal FROM ProductOfMealEntity productOfMeal WHERE productOfMeal.mealName.mealName = 'Kolacja' AND productOfMeal.dayName.dayName = :dayName AND productOfMeal.owner.username=:username")
    List<ProductOfMealEntity> findAlDinnerFromDay(@Param("dayName")String dayName, String username);

    @Query("SELECT productOfMeal FROM ProductOfMealEntity productOfMeal WHERE productOfMeal.dayName.dayName = :dayName AND productOfMeal.owner.username=:username")
    List<ProductOfMealEntity> findAllProductsFromDay(@Param("dayName")String dayName, String username);
}
