package com.github.misisisisi.dietfromatoz.service;


import com.github.misisisisi.dietfromatoz.model.Results;
import com.github.misisisisi.dietfromatoz.model.ResultsEnergyEntity;
import com.github.misisisisi.dietfromatoz.repository.ResultEnergyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ResultEnergyService {

    private final ResultEnergyRepository energyRepository;


    @Transactional
    public void saveEnergyValues(Results resultsEnergy) {
        energyRepository.save(ResultsEnergyEntity.builder()
                .resultCPM(resultsEnergy.getResultCPM())
                .resultPPM(resultsEnergy.getResultPPM())
                .resultEndCPM(resultsEnergy.getResultEndCPM())
                .owner(resultsEnergy.getOwner())
                .build());

    }
}
