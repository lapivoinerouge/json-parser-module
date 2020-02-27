package com.parser.repository;

import com.parser.domain.MetaData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface MetaDataRepository extends CrudRepository<MetaData, String> {
    @Override
    List<MetaData> findAll();

    @Override
    MetaData save(MetaData data);

    void deleteByFrameId(String frameId);

    MetaData findByFrameId(String frameId);
}
