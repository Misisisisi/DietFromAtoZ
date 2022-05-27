package com.github.misisisisi.dietfromatoz.service;

import com.github.misisisisi.dietfromatoz.controller.CreatePersonForm;
import com.github.misisisisi.dietfromatoz.controller.CreateProductForm;
import com.github.misisisisi.dietfromatoz.model.PersonDataEntity;
import com.github.misisisisi.dietfromatoz.model.ProductEntity;
import com.github.misisisisi.dietfromatoz.model.UserEntity;
import com.github.misisisisi.dietfromatoz.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class DefaultProductService implements ProductService {


    private final ProductRepository productRepository;


    @Override
    @Transactional
    public void saveProduct(CreateProductForm createProductForm) {
        productRepository.save(ProductEntity.builder()
                .productName(createProductForm.getProductName())
                .energyValue(createProductForm.getEnergyValue())
                .protein(createProductForm.getProtein())
                .carbohydrates(createProductForm.getCarbohydrates())
                .fats(createProductForm.getFats())
                .weight(createProductForm.getWeight())
//                .owner(createProductForm.getUser())
                .build());

    }
}