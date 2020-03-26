package com.parser.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class PedestriansDto {
    @JsonProperty("imageFilename")
    private String imageFilename;

    @JsonProperty("index")
    private Integer index;

    @JsonProperty("bboW")
    private BigDecimal bboW;

    @JsonProperty("bboX")
    private BigDecimal bboX;

    @JsonProperty("hail")
    private boolean hail;

    @JsonProperty("bboH")
    private BigDecimal bboH;

    @JsonProperty("hailProbability")
    private BigDecimal hailProbability;

    @JsonProperty("notHailProbability")
    private BigDecimal notHailProbability;

    @JsonProperty("bboY")
    private BigDecimal bboY;
}
