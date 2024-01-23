package com.example.mi_primera_api_rest.repository;

import com.example.mi_primera_api_rest.model.Circuit;
import com.example.mi_primera_api_rest.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CircuitRepository extends JpaRepository<Circuit, Long> {
   Optional<Circuit> findByCircuitrefIgnoreCase(String circuitref);

}
