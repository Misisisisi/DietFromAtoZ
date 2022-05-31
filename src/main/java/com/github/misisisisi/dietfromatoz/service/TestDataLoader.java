package com.github.misisisisi.dietfromatoz.service;

import com.github.misisisisi.dietfromatoz.model.ProductEntity;
import com.github.misisisisi.dietfromatoz.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@ConditionalOnProperty(name = "spring.jpa.hibernate.ddl-auto", havingValue = "create-drop")
@Component
@Slf4j
@RequiredArgsConstructor
public class TestDataLoader {

    private final ProductRepository productRepository;

    @EventListener
    public void loadData(ContextRefreshedEvent event) {
        log.debug("Loading data...");
        productRepository.save(ProductEntity.builder()
                        .productName("ananas")
                        .carbohydrates(13.0)
                        .protein(0.5)
                        .fats(0.1)
                        .energyValue(50)
                        .weight(100)
                .build());
            productRepository.save(ProductEntity.builder()
                        .productName("truskawki")
                        .carbohydrates(8)
                        .protein(0.7)
                        .fats(0.3)
                        .energyValue(32)
                        .weight(100)
                .build());

    }
}
