package com.example.mi_primera_api_rest.repository;

import com.example.mi_primera_api_rest.model.Circuit;
import com.example.mi_primera_api_rest.model.Race;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RaceRepository extends JpaRepository<Race, Long> {
   Optional<Race> findByNameIgnoreCase(String name);

}
