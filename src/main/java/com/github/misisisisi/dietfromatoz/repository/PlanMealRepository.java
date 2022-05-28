package com.github.misisisisi.dietfromatoz.repository;

import com.github.misisisisi.dietfromatoz.model.MealNameEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanMealRepository extends JpaRepository<MealNameEntity, Long> {


}
