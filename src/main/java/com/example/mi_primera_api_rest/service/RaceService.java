package com.example.mi_primera_api_rest.service;

import com.example.mi_primera_api_rest.model.Driver;
import com.example.mi_primera_api_rest.model.Race;

import java.util.List;
import java.util.Optional;

public interface RaceService {
    List<Race> getAllRaces();
    Optional<Race> getRaceByName(String name);

    void saveRace(Race race);

    void deleteRaceByName(String name);
}
