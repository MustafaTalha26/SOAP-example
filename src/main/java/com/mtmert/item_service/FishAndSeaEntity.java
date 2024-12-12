package com.mtmert.item_service;

import com.spring.mtmert.people_service.Season;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "denizbalik")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FishAndSeaEntity {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "specieName", nullable = false)
    private String specieName;

    @Column(name = "region", nullable = false)
    private String region;

    @Column(name = "fishingMethod", nullable = false)
    private String fishingMethod;

    @Column(name = "fishPopulation", nullable = false)
    private Long fishPopulation; // Use Long instead of BigInteger for database compatibility

    @Column(name = "averageSize")
    private Float averageSize;

    @Column(name = "overfishingRisk", nullable = false)
    private String overfishingRisk;

    @Column(name = "waterTemperature")
    private Float waterTemperature;

    @Column(name = "waterPollutionLevel", nullable = false)
    private String waterPollutionLevel;

    @Enumerated(EnumType.STRING) // For storing enum values as strings
    @Column(name = "season", nullable = false)
    private Season season;
}
