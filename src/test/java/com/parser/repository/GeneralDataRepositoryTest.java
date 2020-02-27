package com.parser.repository;

import com.parser.JsonParserModuleApplication;
import com.parser.domain.GeneralData;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = JsonParserModuleApplication.class)
public class GeneralDataRepositoryTest {

    @Autowired
    private GeneralDataRepository repository;

    @Test
    public void testSave() {
        //Given
        GeneralData data = new GeneralData("frameId1", "confVersion", "imageFilename", "imageLabelledFilename", BigDecimal.valueOf(5), "deviceId");

        //When
        repository.save(data);
        String id = data.getFrameId();

        //Then
        assertNotNull(repository.findByFrameId(id));

        //CleanUp
        repository.deleteByFrameId(id);
    }

    @Test
    public void testDelete() {
        //Given
        GeneralData data = new GeneralData("frameId2", "confVersion", "imageFilename", "imageLabelledFilename", BigDecimal.valueOf(5), "deviceId");
        repository.save(data);
        String id = data.getFrameId();

        //When
        repository.deleteByFrameId(id);

        //Then
        assertNull(repository.findByFrameId(id));
    }
}