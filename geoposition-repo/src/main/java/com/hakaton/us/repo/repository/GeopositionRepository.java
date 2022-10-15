package com.hakaton.us.repo.repository;

import com.hakaton.us.repo.entity.Geoposition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface GeopositionRepository extends JpaRepository<Geoposition, Long>, JpaSpecificationExecutor<Geoposition> {

}