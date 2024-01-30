package com.example.mi_primera_api_rest.repository;

import com.example.mi_primera_api_rest.model.Circuit;
import com.example.mi_primera_api_rest.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CircuitRepository extends JpaRepository<Circuit, Long> {
   Optional<Circuit> findByCircuitrefIgnoreCase(String circuitref);

}
