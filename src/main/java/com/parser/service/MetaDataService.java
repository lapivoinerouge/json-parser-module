package com.parser.service;

import com.parser.domain.MetaData;
import com.parser.repository.MetaDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MetaDataService {

    @Autowired
    private MetaDataRepository repository;

    public List<MetaData> getAllMetaData() {
        return repository.findAll();
    }

    public MetaData getMetaDataByFrameId(String frameId) {
        return repository.findByFrameId(frameId);
    }

    public MetaData saveMetaData(MetaData data) {
        return repository.save(data);
    }

    public void deleteMetaDataById(String frameId) {
        repository.deleteByFrameId(frameId);
    }
}
