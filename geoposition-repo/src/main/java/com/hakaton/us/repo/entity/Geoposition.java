package com.hakaton.us.repo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "geo")
public class Geoposition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long driverId;

    @Column(name = "vehicle")
    private String vehicle;

    @Column(name = "longitude")
    private double longitude;

    @Column(name = "latitude")
    private double latitude;
}
