package com.parser.controller;

import com.parser.domain.Pedestrians;
import com.parser.dto.ParserDataDto;
import com.parser.mapper.JsonResponseMapper;
import com.parser.service.GeneralDataService;
import com.parser.service.MetaDataService;
import com.parser.service.PedestrianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/parser")
public class ParserController {

    @Autowired
    private JsonResponseMapper mapper;
    @Autowired
    private GeneralDataService generalDataService;
    @Autowired
    private MetaDataService metaDataService;
    @Autowired
    private PedestrianService pedestrianService;

    @PostMapping(value = "/")
    public void addData(@RequestBody ParserDataDto parserData) {
        generalDataService.saveGeneralData(mapper.mapToGeneralData(parserData));
        metaDataService.saveMetaData(mapper.mapToMetaData(parserData));
        for (Pedestrians pedestrians : mapper.mapToPedestrians(parserData)) {
            pedestrianService.savePedestrian(pedestrians);
        }
    }
}
