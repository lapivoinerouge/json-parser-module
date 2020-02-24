package com.parser.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity(name = "meta_data")
public class MetaData {
    @Id
    private String frameId;

    @Column
    @NotNull
    private BigDecimal recognitionFrameRate;

    @Column(name = "GPS_LAT")
    @NotNull
    private BigDecimal gpsLat;

    @Column(name = "GPS_LON")
    @NotNull
    private BigDecimal gpsLon;

    @Column
    private BigDecimal speed;

    @Column
    private BigDecimal accelerationX;

    @Column
    private BigDecimal accelerationY;

    @Column
    private BigDecimal accelerationZ;

    @Column
    private BigDecimal volumeCaoacityPercentage;

    @Column
    private BigDecimal altitude;

    @Column
    private BigDecimal batteryLevel;

    @Column
    private String networkType;

    @Column
    private BigDecimal verticalAccuracy;

    @Column
    private BigDecimal horizontalAccuracy;
}
