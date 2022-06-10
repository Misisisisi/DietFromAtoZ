package com.github.misisisisi.dietfromatoz.repository;

import com.github.misisisisi.dietfromatoz.model.PersonDataEntity;
import com.github.misisisisi.dietfromatoz.model.ResultsEnergyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ResultEnergyRepository extends JpaRepository<ResultsEnergyEntity, Long> {

    List<ResultsEnergyEntity> findAllByOwner_username(String username);
    @Query("SELECT resultEnergy FROM ResultsEnergyEntity resultEnergy WHERE resultEnergy.owner.username = :username")
    ResultsEnergyEntity findResultEnergyEntityByUserName(String username);


}
