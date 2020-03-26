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
public class MetadataDto {
    @JsonProperty("recognitionFramerate")
    private BigDecimal recognitionFrameRate;

    @JsonProperty("networkType")
    private String networkType;

    @JsonProperty("batteryLevel")
    private BigDecimal batteryLevel;

    @JsonProperty("acceleration")
    private AccelerationDto acceleration;

    @JsonProperty("gps")
    private GpsDto gps;

    @JsonProperty("volumeCaoacityPercentage")
    private BigDecimal volumeCapacityPercentage;
}
