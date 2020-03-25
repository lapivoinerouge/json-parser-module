package com.parser.service;

import com.parser.domain.GeneralData;
import com.parser.repository.GeneralDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneralDataService {

    @Autowired
    private GeneralDataRepository repository;

    public List<GeneralData> getAllGeneralData() {
        return repository.findAll();
    }

    public GeneralData getGeneralDataByFrameId(String frameId) {
        return repository.findByFrameId(frameId);
    }

    public GeneralData saveGeneralData(GeneralData data) {
        return repository.save(data);
    }

    public void deleteGeneralDataById(String frameId) {
        repository.deleteByFrameId(frameId);
    }
}
