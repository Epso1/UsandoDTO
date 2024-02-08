package com.example.mi_primera_api_rest.projections;

import org.springframework.beans.factory.annotation.Value;

public interface DriverDetails {
    Long getDriverId();
    String getCode();

    // Dentro de la anotación “@Value” se utiliza Spring Expression Language(SpEL)
    @Value("#{target.forename + ' ' + target.surname}")
    String getFullname();
}
