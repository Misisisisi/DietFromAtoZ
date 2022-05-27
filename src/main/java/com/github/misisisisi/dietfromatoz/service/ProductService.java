package com.github.misisisisi.dietfromatoz.service;

import com.github.misisisisi.dietfromatoz.controller.CreateProductForm;
import org.springframework.transaction.annotation.Transactional;


public interface ProductService {

    @Transactional
    void saveProduct(CreateProductForm createProductForm);
}
