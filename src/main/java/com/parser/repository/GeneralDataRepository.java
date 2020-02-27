package com.parser.repository;

import com.parser.domain.GeneralData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface GeneralDataRepository extends CrudRepository<GeneralData, String> {
    @Override
    List<GeneralData> findAll();

    @Override
    GeneralData save(GeneralData data);

    void deleteByFrameId(String frameId);

    GeneralData findByFrameId(String frameId);
}
