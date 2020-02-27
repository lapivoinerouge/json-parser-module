package com.parser.repository;

import com.parser.JsonParserModuleApplication;
import com.parser.domain.GeneralData;
import com.parser.domain.Pedestrians;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = JsonParserModuleApplication.class)
public class PedestrianRepositoryTest {

    @Autowired
    private GeneralDataRepository generalDataRepository;
    @Autowired
    private PedestrianRepository pedestrianRepository;

    @Test
    public void testSave() {
        //Given
        GeneralData generalData = new GeneralData("frameId1", "confVersion", "imageFilename", "imageLabelledFilename", BigDecimal.valueOf(5), "deviceId");
        Pedestrians pedestrian = new Pedestrians("frameId1", 1, "image_filename", true, BigDecimal.valueOf(1), BigDecimal.valueOf(2), BigDecimal.valueOf(3), BigDecimal.valueOf(4), BigDecimal.valueOf(5), BigDecimal.valueOf(6));

        //When
        generalDataRepository.save(generalData);
        pedestrianRepository.save(pedestrian);
        String id = pedestrian.getFrameId();

        //Then
        assertNotNull(pedestrianRepository.findByFrameId(id));

        //CleanUp
        pedestrianRepository.deleteByFrameId(id);
        generalDataRepository.deleteByFrameId(id);
    }

    @Test
    public void testDelete() {
        //Given
        GeneralData generalData = new GeneralData("frameId1", "confVersion", "imageFilename", "imageLabelledFilename", BigDecimal.valueOf(5), "deviceId");
        Pedestrians pedestrian = new Pedestrians("frameId1", 1, "image_filename", true, BigDecimal.valueOf(1), BigDecimal.valueOf(2), BigDecimal.valueOf(3), BigDecimal.valueOf(4), BigDecimal.valueOf(5), BigDecimal.valueOf(6));
        generalDataRepository.save(generalData);
        pedestrianRepository.save(pedestrian);
        String id = pedestrian.getFrameId();

        //When
        pedestrianRepository.deleteByFrameId(id);

        //Then
        assertNull(pedestrianRepository.findByFrameId(id));

        //CleanUp
        generalDataRepository.deleteByFrameId(id);
    }
}