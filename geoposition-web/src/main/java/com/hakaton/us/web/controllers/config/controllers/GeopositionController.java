package com.hakaton.us.web.controllers.config.controllers;


import com.hakaton.us.dto.GeopositionDto;
import com.hakaton.us.service.services.GeopositionService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController("/app")
public class GeopositionController {
    private final GeopositionService geopositionService;

    public GeopositionController(GeopositionService geopositionService) {
        this.geopositionService = geopositionService;
    }

    @PostMapping("/geoposition")
    public ResponseEntity<GeopositionDto> createGeoposition(@RequestBody GeopositionDto geopositionDto) {
        GeopositionDto response = geopositionService.createOrUpdateGeoposition(geopositionDto);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/geoposition/{id}")
    public ResponseEntity<GeopositionDto> findApplication(@RequestParam("driver_id") Long driverId){
        GeopositionDto response = geopositionService.findGeoposition(driverId);
        return ResponseEntity.ok(response);
    }
}
