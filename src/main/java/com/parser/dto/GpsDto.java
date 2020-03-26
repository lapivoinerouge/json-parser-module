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
public class GpsDto {
    @JsonProperty("verticalAccuracy")
    private BigDecimal verticalAccuracy;

    @JsonProperty("horizontalAccuracy")
    private BigDecimal horizontalAccuracy;

    @JsonProperty("speed")
    private BigDecimal speed;

    @JsonProperty("latitude")
    private BigDecimal gpsLat;

    @JsonProperty("longitude")
    private BigDecimal gpsLon;

    @JsonProperty("altitude")
    private BigDecimal altitude;
}
