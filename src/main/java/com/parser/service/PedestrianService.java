package com.parser.service;

import com.parser.domain.Pedestrians;
import com.parser.repository.PedestrianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedestrianService {
    @Autowired
    private PedestrianRepository repository;

    public List<Pedestrians> getAllPedestrians() {
        return repository.findAll();
    }

    public Pedestrians getPedestrianByFrameId(String frameId) {
        return repository.findByFrameId(frameId);
    }

    public Pedestrians getPedestrianByPedIdx(Integer pedIdx) {
        return repository.findByPedIdx(pedIdx);
    }

    public Pedestrians savePedestrian(Pedestrians data) {
        return repository.save(data);
    }

    public void deletePedestrianById(String frameId) {
        repository.deleteByFrameId(frameId);
    }
}
