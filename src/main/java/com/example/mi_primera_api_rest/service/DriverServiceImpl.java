package com.example.mi_primera_api_rest.service;

import com.example.mi_primera_api_rest.dto.DriverDTO;
import com.example.mi_primera_api_rest.mapper.DriverDTOMapper;
import com.example.mi_primera_api_rest.model.Driver;
import com.example.mi_primera_api_rest.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class DriverServiceImpl implements DriverService {
    private final DriverRepository driverRepository;
    private final DriverDTOMapper driverDTOMapper;

    @Autowired
    public DriverServiceImpl(DriverRepository driverRepository, DriverDTOMapper driverDTOMapper) {
        this.driverRepository = driverRepository;
        this.driverDTOMapper = driverDTOMapper;
    }
    @Override
    public List<Driver> getAllDrivers() {
        return driverRepository.findAll();
    }

    @Override
    public Optional<DriverDTO> getDriverByCode(String code) {
        return driverRepository.findByCodeIgnoreCase(code).map(driverDTOMapper);
    }

    @Override
    public void saveDriver(Driver driver) {
        driverRepository.save(driver);
    }

    @Override
    public void deleteDriverByCode(String code) { driverRepository.deleteByCodeIgnoreCase(code);}
}
