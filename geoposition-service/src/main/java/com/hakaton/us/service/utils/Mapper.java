package com.hakaton.us.service.utils;


import com.hakaton.us.dto.GeopositionDto;
import com.hakaton.us.repo.entity.Geoposition;
import org.springframework.stereotype.Component;

@Component
public class Mapper {
    public static Geoposition mapToGeoposition(GeopositionDto geopositionDto) {
        return new Geoposition(geopositionDto.getDriverId(), geopositionDto.getVehicle(), geopositionDto.getLongitude(), geopositionDto.getLatitude());
    }

    public static GeopositionDto mapToGeopositionDto(Geoposition geoposition) {
        return new GeopositionDto(geoposition.getDriverId(), geoposition.getVehicle(), geoposition.getLongitude(), geoposition.getLatitude());
    }

}
