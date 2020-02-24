package com.parser.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity(name = "pedestrians")
@IdClass(CompositePedestrianId.class)
public class Pedestrian implements Serializable {
    @Id
    private String frameId;

    @Id
    private Integer pedIdx;

    @Column
    @NotNull
    private String imageFilename;

    @Column
    @NotNull
    private boolean hail;

    @Column
    @NotNull
    private BigDecimal hailProbability;

    @Column
    @NotNull
    private BigDecimal notHailProbability;

    @Column
    private BigDecimal bboW;

    @Column
    private BigDecimal bboX;

    @Column
    private BigDecimal bboH;

    @Column
    private BigDecimal bboY;
}
