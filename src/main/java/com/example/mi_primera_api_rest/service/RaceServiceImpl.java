package com.example.mi_primera_api_rest.service;

import com.example.mi_primera_api_rest.model.Driver;
import com.example.mi_primera_api_rest.model.Race;
import com.example.mi_primera_api_rest.repository.DriverRepository;
import com.example.mi_primera_api_rest.repository.RaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RaceServiceImpl implements RaceService {
    private final RaceRepository repository;

    @Autowired
    public RaceServiceImpl(RaceRepository repository) {
        this.repository = repository;
    }
    @Override
    public List<Race> getAllRaces() {
        return repository.findAll();
    }

    @Override
    public Optional<Race> getRaceByName(String name) {
        return repository.findByNameIgnoreCase(name);
    }

    @Override
    public void saveRace(Race race) {
        repository.save(race);
    }

    @Override
    public void deleteRaceByName(String name) { repository.delete(getRaceByName(name).get());}
}
