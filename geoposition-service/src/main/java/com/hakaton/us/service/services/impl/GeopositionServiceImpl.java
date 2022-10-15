package com.hakaton.us.service.services.impl;

import com.hakaton.us.dto.GeopositionDto;
import com.hakaton.us.repo.entity.Geoposition;
import com.hakaton.us.repo.repository.GeopositionRepository;
import com.hakaton.us.service.services.GeopositionService;
import com.hakaton.us.service.utils.Mapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


@Service
@Slf4j
public class GeopositionServiceImpl implements GeopositionService {
    private final GeopositionRepository geopositionRepository;

    public GeopositionServiceImpl(GeopositionRepository geopositionRepository) {
        this.geopositionRepository = geopositionRepository;
    }

    @Override
    @Transactional
    public GeopositionDto createGeoposition(GeopositionDto geopositionDto) {
        Geoposition geoposition = Mapper.mapToGeoposition(geopositionDto);
        geopositionRepository.save(geoposition);
        return geopositionDto;
    }

    @Override
    @Transactional
    public void removeGeoposition(Long driverId) {
        Optional<Geoposition> geoposition = geopositionRepository.findById(driverId);
        geoposition.ifPresent(geopositionRepository::delete);
    }

    @Override
    @Transactional
    public void updateGeoposition(GeopositionDto geopositionNew) {
        Optional<Geoposition> geopositionOldOpt = geopositionRepository.findById(geopositionNew.getDriverId());
        if (geopositionOldOpt.isPresent()) {
            Geoposition geoposition = geopositionOldOpt.get();

            geoposition.setDriverId(geopositionNew.getDriverId());
            geoposition.setVehicle(geopositionNew.getVehicle());
            geoposition.setLongitude(geopositionNew.getLongitude());
            geoposition.setLatitude(geopositionNew.getLatitude());

            geopositionRepository.save(geoposition);
        }
    }

    @Override
    public GeopositionDto findGeoposition(Long driverId) {
        Optional<Geoposition> geopositionOpt = geopositionRepository.findById(driverId);
        return geopositionOpt.map(Mapper::mapToGeopositionDto).orElse(null);
    }

    @Override
    public GeopositionDto createOrUpdateGeoposition(GeopositionDto geopositionDto) {
        if (geopositionDto.getDriverId() == null) {
            return createGeoposition(geopositionDto);
        }
        updateGeoposition(geopositionDto);
        return geopositionDto;
    }
}
