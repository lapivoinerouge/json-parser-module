package com.parser.repository;

import com.parser.domain.MetaData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
@Repository
public interface MetaDataRepository extends CrudRepository<MetaData, String> {
    @Override
    List<MetaData> findAll();

    @Override
    MetaData save(MetaData data);

    void deleteByFrameId(String frameId);

    Optional<MetaData> findByFrameId(String frameId);
}
