package com.parser.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ParserDataDto {
    @JsonProperty("configVersion")
    private String configVersion;

    @JsonProperty("frameId")
    private String frameId;

    @JsonProperty("deviceId")
    private String deviceId;

    @JsonProperty("pedestrians")
    private PedestriansDto[] pedestrians;

    @JsonProperty("imageLabelledFilename")
    private String imageLabelledFilename;

    @JsonProperty("timestamp")
    private BigDecimal timestamp;

    @JsonProperty("imageFilename")
    private String imageFilename;

    @JsonProperty("metadata")
    private MetadataDto metadata;
}
