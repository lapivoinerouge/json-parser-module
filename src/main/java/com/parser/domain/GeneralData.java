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
@Entity(name = "general_data")
public class GeneralData {
    @Id
    private String frameId;

    @Column
    private String configVersion;

    @Column
    @NotNull
    private String imageFilename;

    @Column
    @NotNull
    private String imageLabelledFilename;

    @Column
    @NotNull
    private BigDecimal timestamp;

    @Column
    @NotNull
    private String deviceId;
}
