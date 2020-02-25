package com.parser.repository;

import com.parser.domain.Pedestrian;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
@Repository
public interface PedestrianRepository extends CrudRepository<Pedestrian, String> {
    @Override
    List<Pedestrian> findAll();

    @Override
    Pedestrian save(Pedestrian pedestrian);

    void deleteByFrameId(String frameId);

    Optional<Pedestrian> findByFrameId(String frameId);
}
