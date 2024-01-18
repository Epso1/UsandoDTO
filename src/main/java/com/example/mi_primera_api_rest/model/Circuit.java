package com.example.mi_primera_api_rest.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "circuits")
public class Circuit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "circuitid")
    private Long circuitid;
    @Column(unique = true, nullable = false)
    private String circuitref;
    @Column(unique = true, nullable = false)
    private String name;
    @Column(nullable = false)
    private String location;
    @Column(nullable = false)
    private String country;
    private double lat;
    private double lng;
    private int alt;
    private String url;
}
//circuitid SERIAL PRIMARY KEY,
//    circuitref VARCHAR (50) UNIQUE NOT NULL,
//    name VARCHAR (100) UNIQUE NOT NULL,
//    location VARCHAR (50) NOT NULL,
//    country VARCHAR (50) NOT NULL,
//    lat double precision,
//    lng double precision,
//    alt integer,
//    url VARCHAR (100)