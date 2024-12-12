package com.mtmert.item_service;

import com.spring.mtmert.people_service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.math.BigInteger;
import java.util.List;

@Endpoint
public class FishAndSeaEndpoint {
    private static final String NAMESPACE_URI = "http://spring.com/mtmert/people-service";

    FishAndSeaRepository fishAndSeaRepository;

    @Autowired
    public FishAndSeaEndpoint(FishAndSeaRepository fishAndSeaRepository) {this.fishAndSeaRepository = fishAndSeaRepository;}

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getFASbySpecieRequest")
    @ResponsePayload
    public GetFASResponse getFASbySpecie(@RequestPayload GetFASbySpecieRequest request) {
        GetFASResponse response = new GetFASResponse();
        List<FishAndSeaEntity> entities= fishAndSeaRepository.findBySpecieName(request.getText());
        for (FishAndSeaEntity entity :entities) {
            FishAndSea balik = getFishAndSea(entity);
            response.getFishAndSea().add(balik);
        }
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getFASbyRegionRequest")
    @ResponsePayload
    public GetFASResponse getFASbyRegion(@RequestPayload GetFASbyRegionRequest request) {
        GetFASResponse response = new GetFASResponse();
        List<FishAndSeaEntity> entities= fishAndSeaRepository.findByRegion(request.getText());
        for (FishAndSeaEntity entity :entities) {
            FishAndSea balik = getFishAndSea(entity);
            response.getFishAndSea().add(balik);
        }
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getFASbySeasonRequest")
    @ResponsePayload
    public GetFASResponse getFASbySeason(@RequestPayload GetFASbySeasonRequest request) {
        GetFASResponse response = new GetFASResponse();
        List<FishAndSeaEntity> entities= fishAndSeaRepository.findBySeason(Season.valueOf(request.getText()));
        for (FishAndSeaEntity entity :entities) {
            FishAndSea balik = getFishAndSea(entity);
            response.getFishAndSea().add(balik);
        }
        return response;
    }

    private static FishAndSea getFishAndSea(FishAndSeaEntity entity) {
        FishAndSea balik = new FishAndSea();
        balik.setAverageSize(entity.getAverageSize());
        balik.setFishingMethod(entity.getFishingMethod());
        balik.setFishPopulation(BigInteger.valueOf(entity.getFishPopulation()));
        balik.setRegion(entity.getRegion());
        balik.setOverfishingRisk(entity.getOverfishingRisk());
        balik.setSpecieName(entity.getSpecieName());
        balik.setSeason(entity.getSeason());
        balik.setWaterTemperature(entity.getWaterTemperature());
        balik.setWaterPollutionLevel(entity.getWaterPollutionLevel());
        return balik;
    }
}
