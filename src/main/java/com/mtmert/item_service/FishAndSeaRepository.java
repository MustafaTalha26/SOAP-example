package com.mtmert.item_service;

import java.util.List;

import com.spring.mtmert.people_service.Season;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FishAndSeaRepository extends JpaRepository<FishAndSeaEntity, Long> {
    List<FishAndSeaEntity> findByspecieName(String text);
    List<FishAndSeaEntity> findByseason(String text);
    List<FishAndSeaEntity> findByregion(Season text);
}
