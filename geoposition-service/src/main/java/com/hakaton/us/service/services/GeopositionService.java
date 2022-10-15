package com.hakaton.us.service.services;

import com.hakaton.us.dto.GeopositionDto;

public interface GeopositionService {
    GeopositionDto createGeoposition(GeopositionDto geopositionDto);

    void removeGeoposition(Long driverId);

    void updateGeoposition(GeopositionDto geopositionNew);

    GeopositionDto findGeoposition(Long driverId);

    GeopositionDto createOrUpdateGeoposition(GeopositionDto geopositionDto);
}
