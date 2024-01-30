package com.example.mi_primera_api_rest.service;

import com.example.mi_primera_api_rest.model.Circuit;
import com.example.mi_primera_api_rest.model.Driver;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface CircuitService {
    List<Circuit> getAllCircuits();
    Optional<Circuit> getCircuitByRef(String circuitRef);

    void saveCircuit(Circuit circuit);

    void deleteCircuitByRef(String circuitRef);
}
