package com.example.mi_primera_api_rest.repository;

import com.example.mi_primera_api_rest.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DriverRepository extends JpaRepository<Driver, Long> {
   Optional<Driver> findByCodeIgnoreCase(String code);

}
