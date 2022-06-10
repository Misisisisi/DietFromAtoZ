package com.github.misisisisi.dietfromatoz.repository;

import com.github.misisisisi.dietfromatoz.model.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PlanMealRepository extends JpaRepository<ProductEntity, Long> {

    ProductEntity findByProductName (String name);

    @Query("SELECT productEntity FROM ProductEntity productEntity WHERE productEntity.productName = :productName AND (productEntity.owner.username=:username OR productEntity.owner.username='admin')")
    ProductEntity findProductByNameAndUserName(String productName, String username);

}
