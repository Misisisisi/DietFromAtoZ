package com.github.misisisisi.dietfromatoz.service;

import com.github.misisisisi.dietfromatoz.model.DayNameEntity;
import com.github.misisisisi.dietfromatoz.model.MealNameEntity;
import com.github.misisisisi.dietfromatoz.model.ProductEntity;
import com.github.misisisisi.dietfromatoz.repository.DayNameRepository;
import com.github.misisisisi.dietfromatoz.repository.MealNameRepository;
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
    private final DayNameRepository dayNameRepository;
    private final MealNameRepository mealNameRepository;

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
        productRepository.save(ProductEntity.builder()
                .productName("jajko")
                .carbohydrates(1.1)
                .protein(13)
                .fats(11)
                .energyValue(155)
                .weight(100)
                .build());
        productRepository.save(ProductEntity.builder()
                .productName("chleb")
                .carbohydrates(49)
                .protein(9)
                .fats(3.2)
                .energyValue(264)
                .weight(100)
                .build());
        productRepository.save(ProductEntity.builder()
                .productName("masło")
                .carbohydrates(0.1)
                .protein(0.9)
                .fats(81)
                .energyValue(716)
                .weight(100)
                .build());
        productRepository.save(ProductEntity.builder()
                .productName("szynka")
                .carbohydrates(1.5)
                .protein(21)
                .fats(6)
                .energyValue(145)
                .weight(100)
                .build());
        productRepository.save(ProductEntity.builder()
                .productName("awokado")
                .carbohydrates(9)
                .protein(2)
                .fats(15)
                .energyValue(160)
                .weight(100)
                .build());
        productRepository.save(ProductEntity.builder()
                .productName("ziemniaki")
                .carbohydrates(17)
                .protein(2)
                .fats(0.1)
                .energyValue(76)
                .weight(100)
                .build());
        productRepository.save(ProductEntity.builder()
                .productName("mleko")
                .carbohydrates(5)
                .protein(3.4)
                .fats(1)
                .energyValue(42)
                .weight(100)
                .build());
        productRepository.save(ProductEntity.builder()
                .productName("ser żółty")
                .carbohydrates(1.3)
                .protein(25)
                .fats(33)
                .energyValue(402)
                .weight(100)
                .build());
        productRepository.save(ProductEntity.builder()
                .productName("ser biały")
                .carbohydrates(3.4)
                .protein(11)
                .fats(4.3)
                .energyValue(98)
                .weight(100)
                .build());
        productRepository.save(ProductEntity.builder()
                .productName("makaron")
                .carbohydrates(25)
                .protein(5)
                .fats(1.1)
                .energyValue(131)
                .weight(100)
                .build());
        productRepository.save(ProductEntity.builder()
                .productName("pomidor")
                .carbohydrates(3.9)
                .protein(0.9)
                .fats(0.2)
                .energyValue(17)
                .weight(100)
                .build());
        productRepository.save(ProductEntity.builder()
                .productName("ogórek")
                .carbohydrates(3.6)
                .protein(0.7)
                .fats(0.1)
                .energyValue(15)
                .weight(100)
                .build());
        productRepository.save(ProductEntity.builder()
                .productName("mięso")
                .carbohydrates(0)
                .protein(26)
                .fats(3.5)
                .energyValue(143)
                .weight(100)
                .build());
        productRepository.save(ProductEntity.builder()
                .productName("tofu")
                .carbohydrates(1.9)
                .protein(8)
                .fats(4.8)
                .energyValue(76)
                .weight(100)
                .build());
        productRepository.save(ProductEntity.builder()
                .productName("soczewica")
                .carbohydrates(20)
                .protein(9)
                .fats(0.4)
                .energyValue(116)
                .weight(100)
                .build());
        productRepository.save(ProductEntity.builder()
                .productName("ciecierzyca")
                .carbohydrates(61)
                .protein(19)
                .fats(6)
                .energyValue(364)
                .weight(100)
                .build());
        productRepository.save(ProductEntity.builder()
                .productName("sałata")
                .carbohydrates(2.9)
                .protein(1.4)
                .fats(0.2)
                .energyValue(14)
                .weight(100)
                .build());
        productRepository.save(ProductEntity.builder()
                .productName("skyr")
                .carbohydrates(4.1)
                .protein(12)
                .fats(0)
                .energyValue(64)
                .weight(100)
                .build());
        productRepository.save(ProductEntity.builder()
                .productName("majonez")
                .carbohydrates(0.6)
                .protein(1)
                .fats(75)
                .energyValue(679)
                .weight(100)
                .build());
        productRepository.save(ProductEntity.builder()
                .productName("ketchup")
                .carbohydrates(26)
                .protein(1.3)
                .fats(0.2)
                .energyValue(111)
                .weight(100)
                .build());
        productRepository.save(ProductEntity.builder()
                .productName("orzechy")
                .carbohydrates(21)
                .protein(20)
                .fats(54)
                .energyValue(606)
                .weight(100)
                .build());
        productRepository.save(ProductEntity.builder()
                .productName("płatki owsiane")
                .carbohydrates(12)
                .protein(2.4)
                .fats(1.4)
                .energyValue(67)
                .weight(100)
                .build());
        productRepository.save(ProductEntity.builder()
                .productName("masło")
                .carbohydrates(0.1)
                .protein(0.9)
                .fats(81)
                .energyValue(716)
                .weight(100)
                .build());
        productRepository.save(ProductEntity.builder()
                .productName("borówki")
                .carbohydrates(14)
                .protein(0.7)
                .fats(0.3)
                .energyValue(57)
                .weight(100)
                .build());
        productRepository.save(ProductEntity.builder()
                .productName("oliwa z oliwek")
                .carbohydrates(0)
                .protein(0)
                .fats(100)
                .energyValue(884)
                .weight(100)
                .build());
        productRepository.save(ProductEntity.builder()
                .productName("olej rzepakowy")
                .carbohydrates(0)
                .protein(0)
                .fats(100)
                .energyValue(884)
                .weight(100)
                .build());
        dayNameRepository.save(DayNameEntity.builder()
                .dayName("Poniedziałek")
                .build());
        dayNameRepository.save(DayNameEntity.builder()
                .dayName("Wtorek")
                .build());
        dayNameRepository.save(DayNameEntity.builder()
                .dayName("Środa")
                .build());
        dayNameRepository.save(DayNameEntity.builder()
                .dayName("Czwartek")
                .build());
        dayNameRepository.save(DayNameEntity.builder()
                .dayName("Piątek")
                .build());
        dayNameRepository.save(DayNameEntity.builder()
                .dayName("Sobota")
                .build());
        dayNameRepository.save(DayNameEntity.builder()
                .dayName("Niedziela")
                .build());
        mealNameRepository.save(MealNameEntity.builder()
                .mealName("Śniadanie")
                .build());
        mealNameRepository.save(MealNameEntity.builder()
                .mealName("II śniadanie")
                .build());
        mealNameRepository.save(MealNameEntity.builder()
                .mealName("Lunch")
                .build());
        mealNameRepository.save(MealNameEntity.builder()
                .mealName("Obiad")
                .build());
        mealNameRepository.save(MealNameEntity.builder()
                .mealName("Podwieczorek")
                .build());
        mealNameRepository.save(MealNameEntity.builder()
                .mealName("Kolacja")
                .build());
        mealNameRepository.save(MealNameEntity.builder()
                .mealName("II kolacja")
                .build());

    }
}
