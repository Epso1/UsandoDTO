package com.example.mi_primera_api_rest.mapper;


import com.example.mi_primera_api_rest.dto.DriverDTO;
import com.example.mi_primera_api_rest.model.Driver;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class DriverDTOMapper implements Function<Driver, DriverDTO> {
    @Override
    public DriverDTO apply(Driver driver) {
        return new DriverDTO(
                driver.getDriverId(),
                driver.getCode(),
                driver.getForename() + " " + driver.getSurname(),
                driver.getNationality(),
                driver.getConstructor().getName()
        );
    }
}