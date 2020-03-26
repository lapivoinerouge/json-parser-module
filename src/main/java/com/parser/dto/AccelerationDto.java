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
public class AccelerationDto {
    @JsonProperty("x")
    private BigDecimal accelerationX;

    @JsonProperty("y")
    private BigDecimal accelerationY;

    @JsonProperty("z")
    private BigDecimal accelerationZ;
}
