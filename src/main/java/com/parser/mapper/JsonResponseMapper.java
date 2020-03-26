package com.parser.mapper;

import com.parser.domain.GeneralData;
import com.parser.domain.MetaData;
import com.parser.domain.Pedestrians;
import com.parser.dto.ParserDataDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class JsonResponseMapper {

    public GeneralData mapToGeneralData(ParserDataDto dto) {
        return new GeneralData(
                dto.getFrameId(),
                dto.getConfigVersion(),
                dto.getImageFilename(),
                dto.getImageLabelledFilename(),
                dto.getTimestamp(),
                dto.getDeviceId());
    }

    public MetaData mapToMetaData(ParserDataDto dto) {
        return new MetaData(
                dto.getFrameId(),
                dto.getMetadata().getRecognitionFrameRate(),
                dto.getMetadata().getGps().getGpsLat(),
                dto.getMetadata().getGps().getGpsLon(),
                dto.getMetadata().getGps().getSpeed(),
                dto.getMetadata().getAcceleration().getAccelerationX(),
                dto.getMetadata().getAcceleration().getAccelerationY(),
                dto.getMetadata().getAcceleration().getAccelerationZ(),
                dto.getMetadata().getVolumeCapacityPercentage(),
                dto.getMetadata().getGps().getAltitude(),
                dto.getMetadata().getBatteryLevel(),
                dto.getMetadata().getNetworkType(),
                dto.getMetadata().getGps().getVerticalAccuracy(),
                dto.getMetadata().getGps().getHorizontalAccuracy());
    }

    public List<Pedestrians> mapToPedestrians(ParserDataDto dto) {
        return dto.getPedestrians().stream()
                .map(p -> new Pedestrians(dto.getFrameId(), p.getIndex(), p.getImageFilename(), p.isHail(), p.getHailProbability(), p.getNotHailProbability(), p.getBboW(), p.getBboX(), p.getBboH(), p.getBboY()))
                .collect(Collectors.toList());
    }
}
