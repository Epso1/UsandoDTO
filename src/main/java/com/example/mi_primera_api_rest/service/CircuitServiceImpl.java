package com.example.mi_primera_api_rest.service;

import com.example.mi_primera_api_rest.model.Circuit;
import com.example.mi_primera_api_rest.model.Driver;
import com.example.mi_primera_api_rest.repository.CircuitRepository;
import com.example.mi_primera_api_rest.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CircuitServiceImpl implements CircuitService {
    private final CircuitRepository repository;

    @Autowired
    public CircuitServiceImpl(CircuitRepository repository) {
        this.repository = repository;
    }
    @Override
    public List<Circuit> getAllCircuits() {
        return repository.findAll();
    }

    @Override
    public Optional<Circuit> getCircuitByRef(String circuitref) {
        return repository.findByCircuitrefIgnoreCase(circuitref);
    }

    @Override
    public void saveCircuit(Circuit circuit) {
        repository.save(circuit);
    }

    @Override
    public void deleteCircuitByRef(String circuitref) { repository.delete(getCircuitByRef(circuitref).get());}
}
