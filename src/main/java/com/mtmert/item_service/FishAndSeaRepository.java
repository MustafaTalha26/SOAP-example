package com.mtmert.item_service;

import java.util.List;

import com.spring.mtmert.people_service.Season;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FishAndSeaRepository extends JpaRepository<FishAndSeaEntity, Long> {
    @Query(value = "SELECT * FROM denizbalik WHERE denizbalik.specieName = ?1", nativeQuery = true)
    List<FishAndSeaEntity> findBySpecieName(String specieName);

    @Query(value = "SELECT * FROM denizbalik WHERE denizbalik.season = ?1", nativeQuery = true)
    List<FishAndSeaEntity> findBySeason(Season season);

    @Query(value = "SELECT * FROM denizbalik WHERE denizbalik.region= ?1", nativeQuery = true)
    List<FishAndSeaEntity> findByRegion(String region);
}
