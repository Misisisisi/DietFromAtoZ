package com.github.misisisisi.dietfromatoz.repository;

import com.github.misisisisi.dietfromatoz.model.ProductOfMealEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RemoveProductFromMealRepository extends JpaRepository<ProductOfMealEntity, Long> {


    ProductOfMealEntity findProductOfMealEntitiesById(Long id);
}
