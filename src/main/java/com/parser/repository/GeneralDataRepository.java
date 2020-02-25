package com.parser.repository;

import com.parser.domain.GeneralData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
@Repository
public interface GeneralDataRepository extends CrudRepository<GeneralData, String> {
    @Override
    List<GeneralData> findAll();

    @Override
    GeneralData save(GeneralData data);

    void deleteByFrameId(String frameId);

    Optional<GeneralData> findByFrameId(String frameId);
}
