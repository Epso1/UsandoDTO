package com.example.mi_primera_api_rest.service;

import com.example.mi_primera_api_rest.model.Driver;

import java.util.List;
import java.util.Optional;

public interface DriverService {
    List<Driver> getAllDrivers();
    Optional<Driver> getDriverByCode(String code);

    void saveDriver(Driver driver);

    void deleteDriverByCode(String code);
}
