package com.example.mi_primera_api_rest.controller;

import com.example.mi_primera_api_rest.model.Circuit;
import com.example.mi_primera_api_rest.model.Driver;
import com.example.mi_primera_api_rest.service.CircuitService;
import com.example.mi_primera_api_rest.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")

public class CircuitRestController {

    private final CircuitService circuitService;

    @Autowired
    public CircuitRestController(CircuitService circuitService) {
        this.circuitService = circuitService;
    }

    @GetMapping("/circuits")
    public ResponseEntity<List<Circuit>> getAll() {
        return ResponseEntity.ok(circuitService.getAllCircuits());
    }

    @GetMapping("/circuits/{circuitref}")
    public ResponseEntity<Circuit> getCircuitByRef(@PathVariable String circuitref) {
        return this.circuitService.getCircuitByRef(circuitref)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/circuits")
    public ResponseEntity<Circuit> create(@RequestBody Circuit circuit) {
        if(circuit.getCircuitid() != null){
            return ResponseEntity.badRequest().build();
        }
        this.circuitService.saveCircuit(circuit);
        return ResponseEntity.ok(circuit);

    }

    @PutMapping("/circuits")
    public ResponseEntity<Circuit> update(@RequestBody Circuit circuit) {
        this.circuitService.saveCircuit(circuit);
        return ResponseEntity.ok(circuit);
    }


    @DeleteMapping("/circuits/{circuitref}")
    public ResponseEntity<Circuit> deleteCircuitByRef(@PathVariable String circuitref) {
        this.circuitService.deleteCircuitByRef(circuitref);
        return ResponseEntity.noContent().build();
    }
}
