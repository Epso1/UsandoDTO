package com.example.mi_primera_api_rest.controller;

import com.example.mi_primera_api_rest.model.Circuit;
import com.example.mi_primera_api_rest.model.Race;
import com.example.mi_primera_api_rest.service.CircuitService;
import com.example.mi_primera_api_rest.service.RaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")

public class RaceRestController {

    private final RaceService raceService;

    @Autowired
    public RaceRestController(RaceService raceService) {
        this.raceService = raceService;
    }

    @GetMapping("/races")
    public ResponseEntity<List<Race>> getAll() {
        return ResponseEntity.ok(raceService.getAllRaces());
    }

    @GetMapping("/races/{name}")
    public ResponseEntity<Race> getRaceByName(@PathVariable String name) {
        return this.raceService.getRaceByName(name)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/races")
    public ResponseEntity<Race> create(@RequestBody Race race) {
        if(race.getRaceid() != null){
            return ResponseEntity.badRequest().build();
        }
        this.raceService.saveRace(race);
        return ResponseEntity.ok(race);

    }

    @PutMapping("/races")
    public ResponseEntity<Race> update(@RequestBody Race race) {
        this.raceService.saveRace(race);
        return ResponseEntity.ok(race);
    }


    @DeleteMapping("/race/{name}")
    public ResponseEntity<Race> deleteRaceByName(@PathVariable String name) {
        this.raceService.deleteRaceByName(name);
        return ResponseEntity.noContent().build();
    }
}
