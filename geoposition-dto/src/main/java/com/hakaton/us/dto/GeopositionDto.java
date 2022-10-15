package com.hakaton.us.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GeopositionDto {
    private Long driverId;

    private String vehicle;

    private double longitude;

    private double latitude;
}
