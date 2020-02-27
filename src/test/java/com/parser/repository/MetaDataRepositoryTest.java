package com.parser.repository;

import com.parser.JsonParserModuleApplication;
import com.parser.domain.GeneralData;
import com.parser.domain.MetaData;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = JsonParserModuleApplication.class)
public class MetaDataRepositoryTest {

    @Autowired
    private GeneralDataRepository generalDataRepository;
    @Autowired
    private MetaDataRepository metaDataRepository;

    @Test
    public void testSave() {
        //Given
        GeneralData generalData = new GeneralData("frameId1", "confVersion", "imageFilename", "imageLabelledFilename", BigDecimal.valueOf(5), "deviceId");
        MetaData metaData = new MetaData("frameId1", BigDecimal.valueOf(1), BigDecimal.valueOf(2), BigDecimal.valueOf(3), BigDecimal.valueOf(4),BigDecimal.valueOf(5),BigDecimal.valueOf(6),BigDecimal.valueOf(7),BigDecimal.valueOf(8), BigDecimal.valueOf(9),BigDecimal.valueOf(10), "network_type", BigDecimal.valueOf(1), BigDecimal.valueOf(1));

        //When
        generalDataRepository.save(generalData);
        metaDataRepository.save(metaData);
        String id = metaData.getFrameId();

        //Then
        assertNotNull(metaDataRepository.findByFrameId(id));

        //CleanUp
        metaDataRepository.deleteByFrameId(id);
        generalDataRepository.deleteByFrameId(id);
    }

    @Test
    public void testDelete() {
        //Given
        GeneralData generalData = new GeneralData("frameId1", "confVersion", "imageFilename", "imageLabelledFilename", BigDecimal.valueOf(5), "deviceId");
        MetaData metaData = new MetaData("frameId1", BigDecimal.valueOf(1), BigDecimal.valueOf(2), BigDecimal.valueOf(3), BigDecimal.valueOf(4),BigDecimal.valueOf(5),BigDecimal.valueOf(6),BigDecimal.valueOf(7),BigDecimal.valueOf(8), BigDecimal.valueOf(9),BigDecimal.valueOf(10), "network_type", BigDecimal.valueOf(1), BigDecimal.valueOf(1));
        generalDataRepository.save(generalData);
        metaDataRepository.save(metaData);
        String id = metaData.getFrameId();

        //When
        metaDataRepository.deleteByFrameId(id);

        //Then
        assertNull(metaDataRepository.findByFrameId(id));

        //CleanUp
        generalDataRepository.deleteByFrameId(id);
    }
}