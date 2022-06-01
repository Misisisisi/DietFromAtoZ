package com.github.misisisisi.dietfromatoz.repository;

import com.github.misisisisi.dietfromatoz.model.DayNameEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DayNameRepository extends JpaRepository<DayNameEntity, Long> {

    DayNameEntity findDayNameEntityByDayName (String dayName);
}
