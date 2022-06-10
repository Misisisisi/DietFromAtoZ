package com.github.misisisisi.dietfromatoz.repository;


import com.github.misisisisi.dietfromatoz.model.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

  Optional<ProductEntity> findByProductName(String productName);

  Optional<ProductEntity> findProductEntityByEnergyValueBetween(int minimum, int maximum);

  Optional<ProductEntity> findProductEntityByCarbohydratesBetween(int minimum, int maximum);

  Optional<ProductEntity> findProductEntityByFatsIsBetween(int minimum, int maximum);

  Optional<ProductEntity> findProductEntityByProteinBetween(int minimum, int maximum);

  @Query("SELECT productEntity FROM ProductEntity productEntity WHERE productEntity.productName = :productName AND (productEntity.owner.username=:username OR productEntity.owner.username='admin')")
  ProductEntity findProductByNameAndUserName(String productName, String username);


}
