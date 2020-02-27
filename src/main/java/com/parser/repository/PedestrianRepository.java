package com.parser.repository;

import com.parser.domain.Pedestrians;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface PedestrianRepository extends CrudRepository<Pedestrians, String> {
    @Override
    List<Pedestrians> findAll();

    @Override
    Pedestrians save(Pedestrians pedestrian);

    void deleteByFrameId(String frameId);

    Pedestrians findByFrameId(String frameId);
}
